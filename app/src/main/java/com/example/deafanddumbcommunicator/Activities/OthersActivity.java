package com.example.deafanddumbcommunicator.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.deafanddumbcommunicator.MainActivity;
import com.example.deafanddumbcommunicator.Prevalent.Prevalent;
import com.example.deafanddumbcommunicator.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;

public class OthersActivity extends AppCompatActivity {

    ImageView imageView;
    EditText titleEdt, descriptionEdt;
    TextView saveButton, showButton;

    private static final int ImageBack1 = 1;
    Uri ImageData;

    private ProgressDialog loadingBar;
    private StorageReference Folder;
    DatabaseReference RootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        Folder = FirebaseStorage.getInstance().getReference().child("Images");
        loadingBar = new ProgressDialog(this);

        imageView = findViewById(R.id.image);
        titleEdt = findViewById(R.id.imgTitle_edt);
        descriptionEdt = findViewById(R.id.imageDescription_edt);
        saveButton = findViewById(R.id.save_button);
        showButton = findViewById(R.id.show_button);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OthersActivity.this, ShowDataActivity.class));
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent,ImageBack1);
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String title = titleEdt.getText().toString();
                String description = descriptionEdt.getText().toString();

                if (ImageData == null)
                {
                    Toast.makeText(OthersActivity.this, "Please upload image", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(title))
                {
                    Toast.makeText(OthersActivity.this, "Please enter image title", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(description))
                {
                    Toast.makeText(OthersActivity.this, "Please enter image description", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    loadingBar.setTitle("Upload Data");
                    loadingBar.setMessage("Please wait, data is uploading");
                    loadingBar.setCanceledOnTouchOutside(false);
                    loadingBar.show();

                    UplaodData(title, description);
                }

            }
        });


    }

    private void UplaodData(String title, String description) {

        StorageReference Imagename = Folder.child(ImageData.getLastPathSegment());
        Imagename.putFile(ImageData).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                Imagename.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        RootRef = FirebaseDatabase.getInstance().getReference();
                        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if (!(snapshot.child("Users").child(Prevalent.currentOnlineUser.getPhone()).child("Data").child(title).exists())) {
                                    HashMap<String, Object> hashMap = new HashMap<>();
                                    hashMap.put("image", String.valueOf(uri));
                                    hashMap.put("title", title);
                                    hashMap.put("description", description);

                                    RootRef.child("Users").child(Prevalent.currentOnlineUser.getPhone()).child("Data").child(title).updateChildren(hashMap)
                                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Void> task) {
                                                    if (task.isSuccessful()) {
                                                        Toast.makeText(OthersActivity.this, "Congratulations, your data uploaded successfully.", Toast.LENGTH_SHORT).show();
                                                        loadingBar.dismiss();
                                                        startActivity(new Intent(OthersActivity.this, ShowDataActivity.class));

                                                        titleEdt.setText("");
                                                        descriptionEdt.setText("");

                                                    } else {
                                                        loadingBar.dismiss();
                                                        Toast.makeText(OthersActivity.this, "Network Error, Please try again after some time...", Toast.LENGTH_SHORT).show();
                                                    }
                                                }
                                            });
                                } else {
                                    Toast.makeText(OthersActivity.this, "This " + title + " already exist", Toast.LENGTH_SHORT).show();
                                    loadingBar.dismiss();
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                });
            }
        });

    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ImageBack1) {
            if (resultCode == RESULT_OK) {

                ImageData = data.getData();
                imageView.setImageURI(ImageData);
            }
        }
    }
}
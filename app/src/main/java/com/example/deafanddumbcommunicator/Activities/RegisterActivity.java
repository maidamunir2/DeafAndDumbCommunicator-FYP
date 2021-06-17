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
import android.widget.TextView;
import android.widget.Toast;

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

import de.hdodenhof.circleimageview.CircleImageView;

public class RegisterActivity extends AppCompatActivity {

    CircleImageView profileImg;
    TextView registerButton, signInButton;
    EditText userNameEdt, phoneNumberEdt, passEdt, conPassEdt;
    private ProgressDialog loadingBar;

    private static final int ImageBack1 = 1;
    Uri ImageData;

    private StorageReference Folder;
    DatabaseReference RootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Folder = FirebaseStorage.getInstance().getReference().child("Profile Images");
        loadingBar = new ProgressDialog(this);

        userNameEdt = findViewById(R.id.userName_edt_register);
        phoneNumberEdt = findViewById(R.id.phoneNum_edt_register);
        passEdt = findViewById(R.id.password_edt_register);
        conPassEdt = findViewById(R.id.confirmPassword_edt_register);
        profileImg = findViewById(R.id.profile_img);
        profileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent,ImageBack1);
            }
        });

        signInButton = findViewById(R.id.txt_signin_register);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
            }
        });
        registerButton = findViewById(R.id.register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = userNameEdt.getText().toString();
                String phone = phoneNumberEdt.getText().toString();
                String password = passEdt.getText().toString();
                String cPassword = conPassEdt.getText().toString();

                if (ImageData == null)
                {
                    Toast.makeText(RegisterActivity.this, "Please upload profile image", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(name) || TextUtils.isEmpty(phone) || TextUtils.isEmpty(password) || TextUtils.isEmpty(cPassword))
                {
                    Toast.makeText(RegisterActivity.this, "Please enter valid data ", Toast.LENGTH_SHORT).show();
                }
                else if (phone.length()<11)
                {
                    phoneNumberEdt.setError("Invalid Phone");
                    Toast.makeText(RegisterActivity.this, "Please enter correct number", Toast.LENGTH_SHORT).show();
                }
                else if (!password.equals(cPassword))
                {
                    Toast.makeText(RegisterActivity.this, "password does not match", Toast.LENGTH_SHORT).show();
                }
                else if (password.length()<6)
                {
                    passEdt.setError("Invalid Password");
                    Toast.makeText(RegisterActivity.this, "Enter 6 character password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    loadingBar.setTitle("Create Account");
                    loadingBar.setMessage("Please wait, while we are checking the credentials.");
                    loadingBar.setCanceledOnTouchOutside(false);
                    loadingBar.show();

                    ValidateAccountInfo(name, phone, password);


                }
                
            }
        });


    }

    private void ValidateAccountInfo(String name, String phone, String password) {

        StorageReference Imagename = Folder.child("image" + ImageData.getLastPathSegment());
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
                                if (!(snapshot.child("Users").child(phone).exists())) {
                                    HashMap<String, Object> hashMap = new HashMap<>();
                                    hashMap.put("profileImg", String.valueOf(uri));
                                    hashMap.put("name", name);
                                    hashMap.put("password", password);
                                    hashMap.put("phone", phone);

                                    RootRef.child("Users").child(phone).updateChildren(hashMap)
                                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Void> task) {
                                                    if (task.isSuccessful()) {
                                                        Toast.makeText(RegisterActivity.this, "Congratulations, Your account has been created.", Toast.LENGTH_SHORT).show();
                                                        loadingBar.dismiss();
                                                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                                                    } else {
                                                        loadingBar.dismiss();
                                                        Toast.makeText(RegisterActivity.this, "Network Error, Please try again after some time...", Toast.LENGTH_SHORT).show();
                                                    }
                                                }
                                            });
                                } else {
                                    Toast.makeText(RegisterActivity.this, "This " + phone + " already exist", Toast.LENGTH_SHORT).show();
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
                profileImg.setImageURI(ImageData);

            }
        }
    }


}
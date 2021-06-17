package com.example.deafanddumbcommunicator.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.deafanddumbcommunicator.HomeFragment;
import com.example.deafanddumbcommunicator.MainActivity;
import com.example.deafanddumbcommunicator.ModelClass.Users;
import com.example.deafanddumbcommunicator.Prevalent.Prevalent;
import com.example.deafanddumbcommunicator.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    TextView signUpButton, loginButton;
    EditText phoneEdt, passEdt;


    private ProgressDialog loadingBar;
    private String parentDbName = "Users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        loadingBar = new ProgressDialog(this);

        phoneEdt = findViewById(R.id.login_phone_edt);
        passEdt = findViewById(R.id.login_pass_Edt);

        signUpButton = findViewById(R.id.txt_signup);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
        loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phone = phoneEdt.getText().toString();
                String password = passEdt.getText().toString();

                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(LoginActivity.this, "Please enter your phone number...", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(password))
                {
                    Toast.makeText(LoginActivity.this, "Please enter your password...", Toast.LENGTH_SHORT).show();
                }
                else if (phone.length()<11)
                {
                    loadingBar.dismiss();
                    phoneEdt.setError("Invalid Phone");
                    Toast.makeText(LoginActivity.this, "Please enter valid phone number", Toast.LENGTH_SHORT).show();
                }
                else if (password.length()<6)
                {
                    loadingBar.dismiss();
                    passEdt.setError("Invalid Password");
                    Toast.makeText(LoginActivity.this, "Please enter valid password", Toast.LENGTH_SHORT).show();
                }
                else {
                    loadingBar.setTitle("Login Account");
                    loadingBar.setMessage("Please wait, while we are checking the credentials.");
                    loadingBar.setCanceledOnTouchOutside(false);
                    loadingBar.show();

                    AllowAccessToAccount(phone, password);
                }

            }
        });

    }

    private void AllowAccessToAccount(String phone, String password) {


        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot)
            {
                if (snapshot.child(parentDbName).child(phone).exists())
                {
                    Users usersData = snapshot.child(parentDbName).child(phone).getValue(Users.class);

                    if (usersData.getPhone().equals(phone))
                    {
                        if (usersData.getPassword().equals(password))
                        {
                            Toast.makeText(LoginActivity.this, "Logged in Successfully.", Toast.LENGTH_SHORT).show();
                            loadingBar.dismiss();

                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);

                            Prevalent.currentOnlineUser = usersData;


                            phoneEdt.setText("");
                            passEdt.setText("");
                        }
                        else
                        {
                            loadingBar.dismiss();
                            passEdt.setError("Invalid Password");
                            Toast.makeText(LoginActivity.this, "Password is incorrect...", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        loadingBar.dismiss();
                        Toast.makeText(LoginActivity.this, "Phone number is incorrect...", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Account with this " + phone + " does not exists.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}
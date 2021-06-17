package com.example.deafanddumbcommunicator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import BAL.UserBAL;
/*import DataAccessLayer.DBHelper;*/

import DataAccessLayer.User;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity{

    EditText emailAddress;
    EditText password;
    Button signInButton;
    /*DBHelper dbHelper;*/
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        emailAddress = findViewById(R.id.EmailAddress);
        password = findViewById(R.id.Password);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Signin(emailAddress.getText().toString(),password.getText().toString());
            }
        });
    }

    private void Signin(String emailAddress, String password)
    {
        if(password != "") {
            Toast.makeText(getApplicationContext(), "Passwords mismatch, Kindly try again",
                    Toast.LENGTH_SHORT).show();
        }
        else
            {
                BAL.UserBAL userBAL = new UserBAL();
                userBAL.ValidateUser(emailAddress, password);}
        }

    }

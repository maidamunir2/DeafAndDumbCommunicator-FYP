package com.example.deafanddumbcommunicator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import BAL.UserBAL;
/*import DataAccessLayer.DBHelper;*/

import DataAccessLayer.DDCDatabsse;
import DataAccessLayer.User;
import androidx.appcompat.app.AppCompatActivity;


public class SignUpActivity extends AppCompatActivity {

    EditText personName;
    EditText emailAddress;
    EditText phoneNumber;
    EditText dob;
    EditText password;
    EditText confirmPassword;
    Button signUpButton;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personName = findViewById(R.id.PersonName);
        emailAddress = findViewById(R.id.EmailAddressSignUp);
        phoneNumber = findViewById(R.id.PhoneNumber);
        dob = findViewById(R.id.Birthdate);
        password = findViewById(R.id.CreatePassword);
        confirmPassword = findViewById(R.id.ConfrimPassword);
        signUpButton = findViewById(R.id.signUpButton2);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Signup(personName.getText().toString(),emailAddress.getText().toString(),phoneNumber.getText().toString(),dob.getText().toString(),password.getText().toString(),confirmPassword.getText().toString());
            }
        });
    }

    private void Signup(String personName, String emailAddress, String phoneNumber, String dob, String password, String confirmPassword)
    {
        if(password != confirmPassword)
        {
            Toast.makeText(getApplicationContext(),"Passwords mismatch, Kindly try again",
                    Toast.LENGTH_SHORT).show();
        }
        else
        {
            BAL.UserBAL userBAL = new UserBAL();
            user = new User(emailAddress.toString().toLowerCase(),phoneNumber.toString(),dob.toString(),password.toString());
            userBAL.Signup(user);
        }
    }

}

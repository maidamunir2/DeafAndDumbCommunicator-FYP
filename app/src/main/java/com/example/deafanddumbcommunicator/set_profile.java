package com.example.deafanddumbcommunicator;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class set_profile extends Fragment {

    public DatePicker picker;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_set_profile, container, false);

        Button signUp = v.findViewById(R.id.signUpButton1);
        TextView signIn = v.findViewById(R.id.signInButton1);
        // Inflate the layout for this fragment
        signUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSignUpForm();
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSignInForm();
            }
        });
        return v;
    }
    public void openSignUpForm(){

        Dialog alert;
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            alert=new Dialog(getActivity(),android.R.style.Theme_Material_Dialog_Alert);
        }else {
            alert = new Dialog(getActivity());
        }
        LayoutInflater inflater=getLayoutInflater();
        View v= inflater.inflate(R.layout.activity_signup,null);

        alert.setContentView(v);

        alert.show();
        Window window = alert.getWindow();
        window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        EditText Birthday=v.findViewById(R.id.Birthdate);
        picker=v.findViewById(R.id.datePicker);


        Birthday.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Dialog alert;
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    alert=new Dialog(getActivity(),android.R.style.Theme_Material_Dialog_Alert);
                }else {
                    alert = new Dialog(getActivity());
                }
                LayoutInflater inflater=getLayoutInflater();
                View v= inflater.inflate(R.layout.date_picker,null);

                alert.setContentView(v);

                alert.show();
                Window window = alert.getWindow();
                window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Birthday.setText(getCurrentDate());
            }

        });
    }
    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();;
        builder.append((picker.getMonth() + 1)+"/");//month is 0 based
        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear());
        return builder.toString();
    }
    public void openSignInForm(){

        Dialog alert;
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            alert=new Dialog(getActivity(),android.R.style.Theme_Material_Dialog_Alert);
        }else {
            alert = new Dialog(getActivity());
        }
        LayoutInflater inflater=getLayoutInflater();
        View v= inflater.inflate(R.layout.activity_signin,null);

        alert.setContentView(v);

        alert.show();
        Window window = alert.getWindow();
        window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}
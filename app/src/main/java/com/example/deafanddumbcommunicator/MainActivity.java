package com.example.deafanddumbcommunicator;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;


public class MainActivity extends AppCompatActivity {

Toolbar toolbar;
private ChipNavigationBar chipNavigationBar;
private Fragment fragment=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        chipNavigationBar=findViewById(R.id.chipNavigation);

        chipNavigationBar.setItemSelected(R.id.home,true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();



     chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
         @Override
         public void onItemSelected(int i) {
             switch (i){
                 case R.id.home:
                     fragment=new HomeFragment();
                     break;
                 case R.id.message:
                     fragment=new TalkFragment();
                     break;
                 case R.id.profile:
                     fragment=new ProfileFragment();
                     break;
             }
             if(fragment!=null){
                 getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
             }
         }
     });

}}
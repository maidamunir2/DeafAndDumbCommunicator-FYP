package com.example.deafanddumbcommunicator.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.deafanddumbcommunicator.Adapter.OfficeAdapter;
import com.example.deafanddumbcommunicator.Adapter.myadapter;
import com.example.deafanddumbcommunicator.ModelClass.DataModel;
import com.example.deafanddumbcommunicator.ModelClass.OfficeModel;
import com.example.deafanddumbcommunicator.Prevalent.Prevalent;
import com.example.deafanddumbcommunicator.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OfficeActivity extends AppCompatActivity {

    RelativeLayout floatingActionBtn;

    RecyclerView recyclerView;
    OfficeAdapter adapter;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        ref = FirebaseDatabase.getInstance().getReference().child("Users")
                .child(Prevalent.currentOnlineUser.getPhone()).child("OfficeData");

        recyclerView = findViewById(R.id.office_RV);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(OfficeActivity.this, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        FirebaseRecyclerOptions<OfficeModel> options =
                new FirebaseRecyclerOptions.Builder<OfficeModel>()
                        .setQuery(ref, OfficeModel.class)
                        .build();

        adapter = new OfficeAdapter(options, OfficeActivity.this);
        recyclerView.setAdapter(adapter);

        floatingActionBtn = findViewById(R.id.floating_action_btn);
        floatingActionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(OfficeActivity.this, OfficeDataUploadingActivity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

}
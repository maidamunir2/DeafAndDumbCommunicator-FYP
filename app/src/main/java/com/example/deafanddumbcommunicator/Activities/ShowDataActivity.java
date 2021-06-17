package com.example.deafanddumbcommunicator.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.deafanddumbcommunicator.Adapter.myadapter;
import com.example.deafanddumbcommunicator.ModelClass.DataModel;
import com.example.deafanddumbcommunicator.Prevalent.Prevalent;
import com.example.deafanddumbcommunicator.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ShowDataActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    myadapter adapter;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        ref = FirebaseDatabase.getInstance().getReference().child("Users")
                .child(Prevalent.currentOnlineUser.getPhone()).child("Data");

        recyclerView = findViewById(R.id.show_RV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<DataModel> options =
                new FirebaseRecyclerOptions.Builder<DataModel>()
                        .setQuery(ref, DataModel.class)
                        .build();

        adapter = new myadapter(options, ShowDataActivity.this);
        recyclerView.setAdapter(adapter);

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
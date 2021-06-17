package com.example.deafanddumbcommunicator;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deafanddumbcommunicator.Activities.OfficeActivity;
import com.example.deafanddumbcommunicator.Activities.OthersActivity;
import com.example.deafanddumbcommunicator.Adapter.myadapter;
import com.google.firebase.database.DatabaseReference;


public class HomeFragment extends Fragment {

    private CardView cardView1;
    private CardView cardView2;
    private CardView cardView3;
    private CardView cardView4;

    RecyclerView recyclerView;

    DatabaseReference ref;
    myadapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        cardView1 = v.findViewById(R.id.card_view1);
        cardView2 = v.findViewById(R.id.card_view2);
        cardView3 = v.findViewById(R.id.card_view3);
        cardView4 = v.findViewById(R.id.card_view4);


        cardView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment fragment = new marketInterface();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment, new houseInterface());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Fragment fragment = new marketInterface();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment, new marketInterface());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(getContext(), OfficeActivity.class));
                /*Fragment fragment = new marketInterface();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment, new office_interface());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(getContext(), OthersActivity.class));
                /*Fragment fragment = new marketInterface();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment, new CamFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
            }
        });



        return v;

    }


}
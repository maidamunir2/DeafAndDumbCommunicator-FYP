package com.example.deafanddumbcommunicator.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.deafanddumbcommunicator.Activities.ItemDetailActivity;
import com.example.deafanddumbcommunicator.Activities.OfficeItemDetailActivity;
import com.example.deafanddumbcommunicator.ModelClass.DataModel;
import com.example.deafanddumbcommunicator.ModelClass.OfficeModel;
import com.example.deafanddumbcommunicator.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


public class OfficeAdapter extends FirebaseRecyclerAdapter<OfficeModel, OfficeAdapter.myviewholder> {

    Context context;

    public OfficeAdapter(@NonNull FirebaseRecyclerOptions<OfficeModel> options, Context context) {
        super(options);
        this.context = context;
    }

    public OfficeAdapter(@NonNull FirebaseRecyclerOptions<OfficeModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull OfficeModel model) {
        holder.title.setText(model.getTitle());
        holder.description.setText(model.getDescription());
        Glide.with(holder.img.getContext()).load(model.getImage()).into(holder.img);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, OfficeItemDetailActivity.class);
                intent.putExtra("Data", model);
                context.startActivity(intent);
            }
        });
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.office_custom_row, parent, false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView title, description;
        CardView cardView;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_custom_office);
            description = itemView.findViewById(R.id.descrip_custom_office);
            img = itemView.findViewById(R.id.img_custom_office);
            cardView = itemView.findViewById(R.id.profile_card_office);

        }
    }
}
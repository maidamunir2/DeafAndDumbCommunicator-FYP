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
import com.example.deafanddumbcommunicator.ModelClass.DataModel;
import com.example.deafanddumbcommunicator.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


public class myadapter extends FirebaseRecyclerAdapter<DataModel,myadapter.myviewholder> {

    Context context;

    public myadapter(@NonNull FirebaseRecyclerOptions<DataModel> options, Context context) {
        super(options);
        this.context = context;
    }

    public myadapter(@NonNull FirebaseRecyclerOptions<DataModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull DataModel model) {
        holder.title.setText(model.getTitle());
        holder.description.setText(model.getDescription());
        Glide.with(holder.img.getContext()).load(model.getImage()).into(holder.img);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra("Data", model);
                context.startActivity(intent);
            }
        });
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_custom_row, parent, false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView title, description;
        CardView cardView;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_custom);
            description = itemView.findViewById(R.id.descrip_custom);
            img = itemView.findViewById(R.id.img_custom);
            cardView = itemView.findViewById(R.id.profile_card);

        }
    }
}
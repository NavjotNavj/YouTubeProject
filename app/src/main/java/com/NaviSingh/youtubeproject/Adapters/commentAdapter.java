package com.NaviSingh.youtubeproject.Adapters;

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

import com.NaviSingh.youtubeproject.Model.comments;
import com.NaviSingh.youtubeproject.R;

import java.util.ArrayList;

public class commentAdapter extends RecyclerView.Adapter<commentAdapter.ExampleViewHolder> {
    private Context context;
    private ArrayList<comments> comments;

    public commentAdapter(Context context, ArrayList<comments> comment) {
        this.context = context;
        this.comments = comment;
    }

    //1
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        //4

        public TextView name, comment,textCircle;

        //2
        public ExampleViewHolder(@NonNull View itemView) {

            super(itemView);
            name = itemView.findViewById(R.id.Name);
            comment = itemView.findViewById(R.id.comment);
            textCircle = itemView.findViewById(R.id.circleText);






        }
    }

    //6.1



    //3
    @NonNull
    @Override
    public commentAdapter.ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //5
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comment_card,viewGroup,false);
        return new ExampleViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder,final int i) {

        final comments uploadCurrent = comments.get(i);
        //7



        exampleViewHolder.textCircle.setText(uploadCurrent.getCircleText());
        exampleViewHolder.name.setText(uploadCurrent.getmName());
       exampleViewHolder.comment.setText(uploadCurrent.getmComment());







    }
    @Override
    public int getItemCount() {
        return comments.size();

    }

}

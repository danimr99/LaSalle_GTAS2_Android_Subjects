package com.subjects.model;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.subjects.R;
import com.subjects.controller.SubjectDetails;


import java.util.List;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.MyViewHolder> {
    private List<Subject> subjects;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, description;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);

            // Get elements of the view for each item of the RecyclerView
            this.title = view.findViewById(R.id.titleTextView);
            this.description = view.findViewById(R.id.descriptionTextView);
            this.image = view.findViewById(R.id.imageView);

            // Set onClickListener to the entire item of the RecyclerView
            view.setOnClickListener(v -> {
                Intent intent = new Intent(v.getContext(), SubjectDetails.class);
                v.getContext().startActivity(intent);
            });
        }
    }

    public SubjectsAdapter(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_item_list,
                parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Subject item = this.subjects.get(position);

        //holder.image.setBackgroundResource(item.getImage());
        holder.title.setText(item.getName());
        holder.description.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return this.subjects.size();
    }
}

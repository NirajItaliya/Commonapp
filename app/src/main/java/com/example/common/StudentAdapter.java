package com.example.common;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {
    ArrayList<studentData> studentDataList;


    public StudentAdapter(List studentDataList) {
        this.studentDataList = (ArrayList<studentData>) studentDataList;
    }

    public StudentAdapter(List studentDataList, horizontalrecyclerview horizontalrecyclerview) {
        this.studentDataList = (ArrayList<studentData>) studentDataList;
    }

    public StudentAdapter(List studentDataList, verticalrecyclerview verticalrecyclerview) {
        this.studentDataList = (ArrayList<studentData>) studentDataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.student_list_row, viewGroup, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        studentData data = (studentData) studentDataList.get(position);
        holder.name.setText(studentDataList.get(position).getName());
        holder.image.setImageResource(studentDataList.get(position).getImage());
               if (studentDataList.get(position).getImage1() != null) {
            holder.image.setImageURI(studentDataList.get(position).getImage1());
        }
        if (studentDataList.get(position).getImage3() != null) {
            holder.image.setImageBitmap(studentDataList.get(position).getImage3());
        }
    }


    @Override
    public int getItemCount() {
        return studentDataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);

            image = itemView.findViewById(R.id.image);
        }
    }
}

package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.Student;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private Context context;
    private List<Student> studentList;
    public RecyclerAdapter() {
    }

    public RecyclerAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_rv_item,parent,false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull RecyclerAdapter.ViewHolder holder, int position) {
Student S= studentList.get(position);
holder.txtname.setText(S.getName());
holder.txtRollNo.setText(S.getRollno());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        TextView txtname,txtRollNo;
        public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.txtname);
            txtRollNo=itemView.findViewById(R.id.txtRollNo);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }

        @Override
        public boolean onLongClick(View v) {
            int pos=getAdapterPosition();
            Toast.makeText(itemView.getContext(),"Del"+studentList.get(pos).getName(),Toast.LENGTH_LONG).show();
          studentList.remove(pos);
            notifyItemRemoved(pos);
            return true;
        }
    }
}
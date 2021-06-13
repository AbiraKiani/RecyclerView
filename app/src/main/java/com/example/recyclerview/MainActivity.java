package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.recyclerview.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Student> studentList=new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recyclerView=findViewById(R.layout.rv_cources);
        setContentView(R.layout.activity_main);

        studentList.add(new Student("A",1));
        studentList.add(new Student("B",2));
        studentList.add(new Student("C",3));
        studentList.add(new Student("D",4));
        studentList.add(new Student("E",5));
 studentList.add(new Student("F",6));
 studentList.add(new Student("G" ,7));
        recyclerAdapter=new RecyclerAdapter(MainActivity.this,studentList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

        recyclerView.setHasFixedSize(true);
    }
}
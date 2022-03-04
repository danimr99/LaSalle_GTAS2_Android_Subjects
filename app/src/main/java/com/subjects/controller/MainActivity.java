package com.subjects.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.subjects.R;
import com.subjects.model.Subject;
import com.subjects.model.SubjectsAdapter;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private RecyclerView subjects;
    public RecyclerView.Adapter adapter;
    public RecyclerView.LayoutManager layoutManager;
    private final Subject[] subjectsList = {
            new Subject(R.drawable.web, R.string.subject_web_title,
                    R.string.subject_web_description,30,
                    R.string.subject_web_professorName),
            new Subject(R.drawable.android, R.string.subject_android_title,
                    R.string.subject_android_description,30,
                    R.string.subject_android_professorName),
            new Subject(R.drawable.online_services, R.string.subject_online_services_title,
                    R.string.subject_online_services_description,
                    30, R.string.subject_online_services_professorName),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get and configure RecyclerView of Subjects
        this.subjects = (RecyclerView) findViewById(R.id.subjectsRecyclerView);

        this.layoutManager = new LinearLayoutManager(this);
        this.subjects.setLayoutManager(layoutManager);

        this.adapter = new SubjectsAdapter(Arrays.asList(this.subjectsList));
        this.subjects.setAdapter(this.adapter);
    }
}
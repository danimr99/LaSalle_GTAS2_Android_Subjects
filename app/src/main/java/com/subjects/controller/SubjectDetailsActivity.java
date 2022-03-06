package com.subjects.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.subjects.R;
import com.subjects.model.Subject;

public class SubjectDetailsActivity extends AppCompatActivity {
    private Subject subject;
    private ImageView subjectImage;
    private TextView subjectDescription;
    private TextView subjectProfessorName;
    private TextView subjectCredits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_details_activity);

        // Get Subject selected on intent
        this.subject = (Subject) this.getIntent().getSerializableExtra("subject");

        // Change activity's title to subject's name
        this.setTitle(this.subject.getName());

        // Get elements by ID from layout
        this.subjectImage = (ImageView) findViewById(R.id.subjectImage);
        this.subjectDescription = (TextView) findViewById(R.id.subjectDescription);
        this.subjectProfessorName = (TextView) findViewById(R.id.subjectProfessorName);
        this.subjectCredits = (TextView) findViewById(R.id.subjectCredits);

        // Set image to ImageView
        this.subjectImage.setBackgroundResource(this.subject.getImage());

        // Set text to each TextView
        this.subjectDescription.setText(this.subject.getDescription());
        this.subjectProfessorName.setText(this.subject.getProfessorName());
        this.subjectCredits.setText(String.valueOf(this.subject.getCredits()));
    }
}
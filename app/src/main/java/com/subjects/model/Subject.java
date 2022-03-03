package com.subjects.model;

import android.graphics.drawable.Drawable;

public class Subject {
    private final Drawable image;
    private final String name;
    private final String description;
    private final int credits;
    private final String professorName;

    public Subject(Drawable image, String name, String description, int credits, String professorName) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.professorName = professorName;
    }
}

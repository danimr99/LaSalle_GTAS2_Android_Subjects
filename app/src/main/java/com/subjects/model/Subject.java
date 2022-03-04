package com.subjects.model;

import android.graphics.drawable.Drawable;

public class Subject {
    //private final Drawable image;
    private final int name;
    private final int description;
    private final int credits;
    private final int professorName;

    public Subject(Drawable image, int name, int description, int credits, int professorName) {
        //this.image = image;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.professorName = professorName;
    }

    public Subject(int name, int description, int credits, int professorName) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.professorName = professorName;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }
}

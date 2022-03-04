package com.subjects.model;


public class Subject {
    private final int image;
    private final int name;
    private final int description;
    private final int credits;
    private final int professorName;

    public Subject(int image, int name, int description, int credits, int professorName) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.professorName = professorName;
    }

    public int getImage() {
        return image;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }
}

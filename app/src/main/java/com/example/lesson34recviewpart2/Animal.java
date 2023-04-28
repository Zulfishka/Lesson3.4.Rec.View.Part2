package com.example.lesson34recviewpart2;

import java.io.Serializable;

public class Animal implements Serializable {

    String name;
    int age;
    String colour;
    int image;

    public Animal(String name, int age, String colour, int image) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setImage(int image) {
        this.image = image;
    }
}



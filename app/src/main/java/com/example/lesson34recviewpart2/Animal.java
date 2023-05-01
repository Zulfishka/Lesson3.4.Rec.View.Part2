package com.example.lesson34recviewpart2;

import java.io.Serializable;

public class Animal implements Serializable {

    String name;
    int age;
    String colour;
    String image;

    public Animal(String name, int age, String colour, String image) {
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

    public String getImage() {
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

    public void setImage(String image) {
        this.image = image;
    }
}



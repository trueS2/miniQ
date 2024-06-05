package com.animal;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Animal(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void introduction() {
        System.out.println(name + age + "introduction");
    }

    public void likefood() {
        System.out.println(name + "likefood");
    }

    public void pasttime() {
        System.out.println(name + "pasttime");
    }

    public void feeling() {
        System.out.println(name + "feeling");
    }




}

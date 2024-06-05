package com.animal;

public class Human extends Animal {
    public Human(String name, int age, double weight, double height){
        super(name, age, weight, height);
    }

    @Override
    public void introduction() {
        System.out.println(getName() + "의 나이는 " + getAge() + "살이고" + " 몸무게와 키는 " + getWeight() + "," + getHeight() + "입니다.");
    }

    @Override
    public void likefood() {
        System.out.println(getName() + "의 최애 음식은 딸기 생크림 케이크입니다");
    }

    @Override
    public void pasttime() {
        System.out.println(getName() + "의 취미는 " + "동물의 숲을 하는 것 입니다.");
    }

    @Override
    public void feeling() {
        System.out.println(getName() + "는 기분이 좋으면 키키키 웃습니다.");
    }



}

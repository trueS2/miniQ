package com.animal;

public class Cat extends Animal {
    public Cat(String name, int age, double weight, double height){
        super(name, age, weight, height);
    }
    @Override
    public void introduction() {
        System.out.println(getName() + "의 나이는 " + getAge() + "살이고" + " 몸무게와 키는 " + getWeight() + "," + getHeight() + "입니다.");
    }

    @Override
    public void likefood() {
        System.out.println(getName() + "의 최애 음식은 츄르입니다.");
    }

    @Override
    public void pasttime() {
        System.out.println(getName() + "의 취미는 " + "집 어지르기 입니다.");
    }

    @Override
    public void feeling() {
        System.out.println(getName() + "는 기분이 좋으면 그르릉 그르릉 소리를 냅니다.");
    }
}

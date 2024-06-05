package com.animal;

import com.animal.Animal;
import com.animal.Human;
import com.animal.Dog;
import com.animal.Cat;

import java.security.PublicKey;


public class Main {
    public static void main(String[]args){
        Human human = new Human("트루", 26, 41.3, 158.8);
        Dog dog = new Dog("산이", 3, 3.5, 10.1);
        Cat cat = new Cat("재동이", 3, 3.5, 10.1);
        Puppy puppy = new Puppy("리틀 산이", 1, 1.5, 5.1);

        human.introduction();
        human.likefood();
        human.pasttime();
        human.feeling();

        dog.introduction();
        dog.likefood();
        dog.pasttime();
        dog.feeling();

        cat.introduction();
        cat.likefood();
        cat.pasttime();
        cat.feeling();

        puppy.introduction();
        puppy.likefood();
        puppy.pasttime();
        puppy.feeling();






    }
}

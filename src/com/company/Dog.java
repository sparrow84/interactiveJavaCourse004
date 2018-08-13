/*
8. У каждого животного есть ограничения на действия
        (бег: кот – 200 м., собака – 500 м.;
        прыжок: кот – 2 м., собака – 0.5 м.;
        плавание: кот не умеет плавать, собака – 10 м.);
 */
package com.company;

import java.util.Random;

public class Dog extends Animal implements Swimable, Runable, Jumpable {

    private double maxJump = 0.5;
    private double maxRun = 500;
    private double maxSwim = 10;

    public Dog(String name) {
        setName(name);
        maxJump = 600 - new Random().nextInt(300);
        maxJump = (10 - new Random().nextInt(5)) / 10;
    }

    @Override
    public void jump(double height) {
        if (height <= maxJump) {
            System.out.println("Dog " + this.getName() + " jump: " + true);
        } else {
            System.out.println("Dog " + this.getName() + " jump: " + false + " (max: " + maxJump + ")");
        }
    }

    @Override
    public void run(double range) {
        if (range <= maxRun) {
            System.out.println("Dog " + this.getName() + " run: " + true);
        } else {
            System.out.println("Dog " + this.getName() + " run: " + false + " (max: " + maxRun + ")");
        }
    }

    @Override
    public void swim(double range) {
        if (range <= maxSwim) {
            System.out.println("Dog " + this.getName() + " swim: " + true);
        } else {
            System.out.println("Dog " + this.getName() + " swim: " + false + " (max: " + maxSwim + ")");
        }
    }
}

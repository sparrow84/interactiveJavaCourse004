/*
8. У каждого животного есть ограничения на действия
        бег: кот – 200 м., собака – 500 м.;
        прыжок: кот – 2 м., собака – 0.5 м.;
        плавание: кот не умеет плавать, собака – 10 м.
 */
package com.company;


import java.util.Random;

public class Cat extends Animal implements Runable, Jumpable  {

    private int maxJump = 2;
    private int maxRun = 200;

    public Cat(String name) {
        setName(name);
        maxJump = 400 - new Random().nextInt(200);
        maxJump = (40 - new Random().nextInt(20)) / 10;
    }

    @Override
    public void jump(double height) {
        if (height <= maxJump) {
            System.out.println("Cat " + this.getName() + " jump: " + true);
        } else {
            System.out.println("Cat " + this.getName() + " jump: " + false + " (max: " + maxJump + ")");
        }
    }

    @Override
    public void run(double range) {
        if (range <= maxRun) {
            System.out.println("Cat " + this.getName() + " run: " + true);
        } else {
            System.out.println("Cat " + this.getName() + " run: " + false + " (max: " + maxRun + ")");
        }
    }
}

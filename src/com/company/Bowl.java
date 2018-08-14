package com.company;

public class Bowl {

    private double maxFoodCount = 500;
    private double foodCount = maxFoodCount;

    public double getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(double foodCount) {
        this.foodCount = foodCount;
    }

    public void fillBowl() {
        foodCount = maxFoodCount;
        System.out.println("Миска наполнена едой." + " (кол-во: " + foodCount + ")");
    }
}

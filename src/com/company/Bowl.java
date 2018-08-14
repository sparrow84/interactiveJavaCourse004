package com.company;

public class Bowl {

    private double maxFoodCount = 500;
    private double foodCount;

    public double getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(double foodCount) {
        this.foodCount = foodCount;
    }

    public void fillBowl() {
        foodCount = maxFoodCount;
    }

    public double feed(double appetite) {



        return 0;
    }


}

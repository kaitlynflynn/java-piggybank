package com.lambdaschool;

// A Quarter worth $0.25

public class Quarter
{
    private static final double isWorth = 0.25;
    private int amount;

    // sets my amount at 1
    public Quarter()
    {
        amount = 1;
    }

    public Quarter(int amount)
    {
        this.amount = amount;
    }

    // returns worth multiplied by amount
    @Override
    public double getWorth()
    {
        return isWorth * amount;
    }

    // returns amount of Quarters
    @Override
    public String getDetails()
    {
        return amount + " Quarter";
    }
}

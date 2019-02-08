package com.lambdaschool;

// A Dollar worth $1.00

public class Dollar
{
    private static final double isWorth = 1.00;
    private int amount;

    // sets my amount at 1
    public Dollar()
    {
        amount = 1;
    }

    public Dollar(int amount)
    {
        this.amount = amount;
    }

    // returns worth multiplied by amount
    @Override
    public double getValue()
    {
        return isWorth * amount;
    }

    // returns $ in front of my amount
    @Override
    public String getDollarSign()
        return "$" + amount;
}

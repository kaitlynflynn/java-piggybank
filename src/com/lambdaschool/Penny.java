package com.lambdaschool;

// A Penny worth $0.01

public class Penny implements CashMoney
{
    private static final double isWorth = 0.01;
    private int amount;

    // sets my amount to 1
    public Penny()
    {
        amount = 1;
    }

    public Penny(int amount)
    {
        this.amount = amount;
    }

    // returns worth multiplied by amount
    @Override
    public double getWorth()
    {
        return isWorth * amount;
    }

    // returns amount of pennies
    @Override
    public String getDetails()
    {
        return amount + " Penny";
    }
}

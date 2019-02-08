package com.lambdaschool;

// A Dime worth $0.10

public class Dime implements CashMoney
{
    private static final double isWorth = 0.10;
    private int amount;

    // sets my amount to 1
    public Dime()
    {
        amount = 1;
    }

    public Dime(int amount)
    {
        this.amount = amount;
    }

    // returns worth multiplied by amount
    @Override
    public double getWorth()
    {
        return isWorth * amount;
    }

    // returns amount of Dimes
    @Override
    public String getDetails()
    {
        return amount + " Dime";
    }
}

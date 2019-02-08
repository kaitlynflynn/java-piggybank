package com.lambdaschool;

// A Nickle worth $0.05

public class Nickle implements CashMoney
{
    private static final double isWorth = 0.05;
    private int amount;

    // sets my amount to 1
    public Nickle()
    {
        amount = 1;
    }

    public Nickle(int amount)
    {
        this.amount = amount;
    }

    // returns worth multiplied by amount
    @Override
    public double getWorth()
    {
        return isWorth * amount;
    }

    // returns amount of Nickles
    @Override
    public String getDetails()
    {
        return amount + " Nickle";
    }
}

package com.lambdaschool;

// Create a collection (array, arraylist, or hashmap) to represent the piggy bank. The collection can hold money.

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        // Created collection using built in function of ArrayList
        ArrayList<CashMoney> puggyBank = new ArrayList<>();
        System.out.println("*** Kaitlyn's Puggy Bank ***");
        puggyBank.add(new Quarter()); // adds Quarter
        puggyBank.add(new Dime()); // adds Dime
        puggyBank.add(new Dollar(5)); // adds 5 Dollars
        puggyBank.add(new Nickle(3)); // adds 3 Nickles
        puggyBank.add(new Dime(7)); // adds 7 Dimes
        puggyBank.add(new Dollar()); // adds Dollar
        puggyBank.add(new Penny(10)); // adds 10 Pennies

        double total = 0;
        for (CashMoney pug : puggyBank)
        {
            total += pug.getWorth();
            System.out.println(pug.getDetails());
        }
        // Prints the value of the puggy bank
        System.out.println("\n*** The puggy bank holds $" + total + " ***");
    }
}

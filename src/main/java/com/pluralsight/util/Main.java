package com.pluralsight.util;

import com.pluralsight.userinterface.HomeScreen;

public class Main {
    public static void main(String[] args) {
/*        Product test = new Sandwich("Custom sandwich", "Rye", 4, true);
        ((Sandwich) test).addTopping(new Scanner(System.in));
        System.out.println("Total cost: " + test.getCost());*/
        HomeScreen hs = new HomeScreen();
        hs.showHomeScreen();
        //ReceiptManager rm = new ReceiptManager();
    }
}

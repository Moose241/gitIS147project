package com.company;
// Moshope Oyeyemi M241@umbc.edu
//IS147 Project: Concept is a coffee store
import java.util.Scanner;

public class MenuSelection {
    double optionsMU2 = 0.0;

    public double MenuSelect() {
        // PRICES OF ITEMS, when user enter the corresponding item number it gives them price of said item and later is used by payment class to calc pay

        //1.1: Espresso...$3.99
        //"2.1: Cappuccino...$4.99 ");
        //"3.1: Cafe Late...$5.99 ");
        //"4.1: Tea from Japan...$7.99 ");
        //"1.2: Iced Late...$3.75 ");
        //"2.2: Cappuccino (ICED)...$4.75 ");
        //"3.2 Iced Mocha...$5.75 ");
        //"4.2 Todoroki's Creme Delight *Special*...$6.99 ");
        //"1.3: Apple Pie...$2.50 ");
        //"2.3: Choc Brownie...$3.50 ");
        //"3.3 Cheesecake...$4.35 ");
        //"4.3 Todoroki's Hot and Cold Custer Donut Delights...$7.50 ");

        System.out.println("To ensure your order is correct, please select order number (eg 1.1) *DUE TO COVID19 PLEASE SELECT {1} ITEM PER ORDER*");

        Scanner SCAN = new Scanner(System.in);
        optionsMU2 = SCAN.nextDouble();
        System.out.println("Input choice");
        return optionsMU2;
    }

    public double userSelection(double userSelection) {
        if (userSelection == 1.1) {
            return 3.99;
        }
        if (userSelection == 2.1) {
            return 4.99;
        }
        if (userSelection == 3.1) {
            return 5.99;
        }
        if (userSelection == 4.1) {
            return 7.99;
        }
        if (userSelection == 1.2) {
            return 3.75;
        }
        if (userSelection == 2.2) {
            return 4.75;
        }
        if (userSelection == 3.2) {
            return 5.75;
        }
        if (userSelection == 4.2) {
            return 6.99;
        }
        if (userSelection == 1.3) {
            return 2.50;
        }
        if (userSelection == 2.3) {
            return 3.50;
        }
        if (userSelection == 3.3) {
            return 4.35;
        }
        if (userSelection == 4.3) {
            return 7.50;
        }
        return 0;
    }
}




package com.company;
// Moshope Oyeyemi M241@umbc.edu
//IS147 Project: Concept is a coffee store
import java.util.Scanner;

public class Menu {
    public void MenuU() {

        //THIS is the menu class that states all the items and their associated price

        System.out.println("[ Todoroki's Coffee Shop Menu Options: ]");
        System.out.println("1 for Hot Beverages Options");
        System.out.println("2 for Cold Beverages Options");
        System.out.println("3 for Desert Options");
        System.out.println("--------------------------");


        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to order from Todoroki's Coffee Shop:");
        int options = input.nextInt();

        switch (options) {

            case 0:
                System.out.println("Please select one of the three options (1,2, or 3)");
                return;


            case 1:
                System.out.println("[ Hot Beverages Options Are: ]");
                System.out.println("--------------------------");
                System.out.println("1.1: Espresso...$3.99 ");
                System.out.println("2.1: Cappuccino...$4.99 ");
                System.out.println("3.1: Cafe Late...$5.99 ");
                System.out.println("4.1: Tea from Japan...$7.99 ");
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("Please select which item you want to order, ex (1.1) *DUE TO COVID19 PLEASE SELECT {1} ITEM PER ORDER*");
                break;

            case 2:
                System.out.println("[ Cold Beverages Options Are: ]");
                System.out.println("--------------------------");
                System.out.println("1.2: Iced Late...$3.75 ");
                System.out.println("2.2 Cappuccino (ICED)...$4.75 ");
                System.out.println("3.2: Iced Mocha...$5.75 ");
                System.out.println("4.2: Todoroki's Creme Delight *Special*...$6.99 ");
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("Please select which item you want to order, ex (1.2) *DUE TO COVID19 PLEASE SELECT {1} ITEM PER ORDER*");
                break;


            case 3:
                System.out.println("[ Desert Options Are: ]");
                System.out.println("--------------------------");
                System.out.println("1.3: Apple Pie...$2.50 ");
                System.out.println("2.3: Choc Brownie...$3.50 ");
                System.out.println("3.3: Cheesecake...$4.35 ");
                System.out.println("4.3: Todoroki's Hot and Cold Custer Donut Delights...$7.50 ");
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("Please select which item you want to order, ex (1.3) *DUE TO COVID19 PLEASE SELECT {1} ITEM PER ORDER*");
                break;

            default:
                System.out.println("Error, Please select one our our delicious options please and your order will be on the way. Thank you!!!");

        }
    }
}
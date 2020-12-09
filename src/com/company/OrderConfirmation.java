package com.company;
// Moshope Oyeyemi M241@umbc.edu
//IS147 Project: Concept is a coffee store

import java.util.Random;
import java.util.Scanner;

public class OrderConfirmation {
    // THIS would give customer confirmation phrase number

    public void OrderCon()  {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your First name: ");
        String first= sc.next().toUpperCase();


        System.out.print("Enter your Last name: ");
        String last= sc.next().toLowerCase();


        String PASS = first+ " " +last + "'s confirmation phrase number is : " + first.charAt(first.length()-1)
                + ((int) Math.floor(Math.random() * 100)) + last.toLowerCase().charAt(0) + last.toLowerCase().charAt(1) +last.toLowerCase().charAt(2);

        System.out.println(PASS);
    }
}
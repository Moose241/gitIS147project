package com.company;
// Moshope Oyeyemi M241@umbc.edu
//IS147 Project: Concept is a coffee store

import java.util.Scanner;

public class Payment {
    //This concept is for the user to input card number
    //write a method to generate payment
    //This code calcs payment based on USER input

    public double printInvoice( double productPrice) {
        System.out.println("The price of the product is :$" + productPrice );
        double totalBill = productPrice + (productPrice * 0.6);
        return totalBill;

    }
    public String checkCreditcard (int creditNumber){
        return "Your payment is approved with credit card number:" + creditNumber;

    }
    public int creditcardInfo(){
        System.out.println("Please enter your Credit Card number");
        Scanner SCAN = new Scanner(System.in);
        int creditCard = SCAN.nextInt();
        return creditCard;
    }
}
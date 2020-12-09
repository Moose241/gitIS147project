package com.company;

// Moshope Oyeyemi M241@umbc.edu
//IS147 Project: Concept is a coffee store

public class Main {


    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| Welcome to Shoto Todoroki's Coffee Shop: Where Your Coffee is Sure To Be Great |");
        System.out.println("----------------------------------------------------------------------------------");

        //Menu with the options and prices should come after intro
        com.company.Menu menuOBJECT = new com.company.Menu();
        menuOBJECT.MenuU();


        //AI correct menu check, system would ask you if what you ordered is the choice you want essentially
        MenuSelection menuCheck = new MenuSelection();
        double menu = menuCheck.MenuSelect();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("-Thank You, your order has been verified and placed. Please get ready to process payment amount-");
        double price =  menuCheck.userSelection(menu);

        //This states the price of the item the customer ordered
        System.out.println("The price is :$"+ price);
        Payment myPayment = new Payment();
        double totalPrice = myPayment.printInvoice(price);

        System.out.println("The total bill is :$" + totalPrice);

        //This is the credit card section, process the payment of said item
        int creditNumber = myPayment.creditcardInfo();
        System.out.println(myPayment.checkCreditcard(creditNumber));

        //This confirms the order and gives the customer a "phrase" they present when they come and pickup their order
        OrderConfirmation OrduConf = new OrderConfirmation();
        OrduConf.OrderCon();
        System.out.println("This is your confirmation phrase, please present when picking up order. Enjoy!!!");
        System.out.println("**Due to covid guidelines, PLEASE wear a mask when entering Shoto Todoroki's Coffee Shop. Stay Safe!!**");

        //This gives store info, in case it is a new customer and doesn't know where store is etc...
        StoreInformation StoreInfoo = new StoreInformation();
        StoreInfoo.storeME();


    }
}



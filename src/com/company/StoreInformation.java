package com.company;
// Moshope Oyeyemi M241@umbc.edu
//IS147 Project: Concept is a coffee store
public class StoreInformation {

    //This code is just giving the customer the stores information

    public void storeME() {

        String[][] iarr = {
                {"Owner:", "  Shoto Todoroki", "  est.1989"},
                {"Location:", " 1000 Hilltop Cir, Baltimore, MD 21250"},
                {"Store Number:", " (111)-222-3333 "},
                {"Store Hours:", " Monday-Saturday: 5am-8pm    Sunday: 6:30am-8pm"}
        };
        System.out.println();
        System.out.println("[ Shoto Todoroki's Coffee Shop Information ]");


        for (int i = 0; i < iarr.length; i = i + 1) {
            for (int j = 0; j < iarr[i].length; j = j + 1) {
                System.out.print(iarr[i][j]);

            }
            System.out.println(" ");
            System.out.println("-----------------------------------------------------------");
        }
    }
}


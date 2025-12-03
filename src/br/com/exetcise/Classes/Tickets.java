package br.com.exetcise.Classes;

import java.util.Scanner;

public class Tickets {
    private int age;
    private double value;
    Scanner sc = new Scanner(System.in);

    //Constructor method
    public Tickets() {
        this.age = 0;
        this.value = 50;
    }

    //Méthods
    //If the person is bellow 18, the price will be with 10% Discount
    //If the person is older than 60, the price will be with 30% Discount
    //If the person is between 18 and 60, the price will be the full price

    public void discountCalc(){
        System.out.println("TICKET DISCOUNT CALCULATOR"+
                "-------------------------\n"+
                "What is your age?");
        age = 0;
        while(age < 1){
            age = sc.nextInt();
            if (age < 0){
                System.out.println("Invalid age\n" +  "Try again: ");
            }
        }

        if(age <= 18){
            value = value - (value *0.1);
            System.out.println("Your Ticket with discount will be: R$" + value);
        }
        else if (age >= 60){
            value = value - (value *0.3);
            System.out.println("Your Ticket with discount will be: R$" + value);

        }else {
            System.out.println("Your Ticket will be at full price: R$" + value);
        }

        //There is also a discount in case someone want to buy more than one ticket
        System.out.println("How many tickets do you want to buy?");
        int quantity = sc.nextInt();

        if(quantity <= 5 && quantity > 1){
            value = value - (value *0.1);
            double total = quantity * value;
            System.out.println("The price will be R$"+value+" per ticket\n"+
                    "And the total will be R$"+total);
        }
        else if(quantity >= 6){
            value = value - (value *0.3);
            double total = quantity * value;
            System.out.println("The price will be R$"+value+" per ticket\n"+
                    "And the total will be R$"+total);
        }else System.out.println("Your Ticket will be at the last price: R$" + value);

    }

}

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

    //Methods

    public void discountCalc(){
        //Quick menu
        System.out.println("TICKET DISCOUNT CALCULATOR"+
                "-------------------------\n"+
                "What is your age?");
        age = 0; //Already defines the age, so it can enter the loop
        while(age < 1){ //Check if the age is valid
            age = sc.nextInt();
            if (age < 0){
                System.out.println("Invalid age\n" +  "Try again: ");
            }
        }
        //Since its valid, it will calculate the discount based on age
        if(age <= 18){//Youngsters of 18 or less receive 10% of discount
            value = value - (value *0.1);
            System.out.println("Your Ticket with discount will be: R$" + value);
        }
        else if (age >= 60){//Elders of 60 or more receive 30% of discount
            value = value - (value *0.3);
            System.out.println("Your Ticket with discount will be: R$" + value);

        }else {//If it's just a normal adult, it's at full price
            System.out.println("Your Ticket will be at full price: R$" + value);
        }

        //There is also a discount in case someone want to buy more than one ticket
        System.out.println("How many tickets do you want to buy?");
        int quantity = sc.nextInt(); //User enters the quantity they want to buy

        if(quantity <= 5 && quantity > 1){// If it's a small quantity, its 10% of discount
            value = value - (value *0.1);
            double total = quantity * value;
            System.out.println("The price will be R$"+value+" per ticket\n"+
                    "And the total will be R$"+total);
        }
        else if(quantity >= 6){// If it's a large quantity, it's 30% of discount
            value = value - (value *0.3);
            double total = quantity * value;
            System.out.println("The price will be R$"+value+" per ticket\n"+
                    "And the total will be R$"+total);
        }else System.out.println("Your Ticket will be at the last price: R$" + value);

    }

}

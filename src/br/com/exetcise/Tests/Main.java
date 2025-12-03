package br.com.exetcise.Tests;

import br.com.exetcise.Classes.Tickets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TICKET DISCOUNT CALCULATOR"+
                "-------------------------\n"+
                "What is your age?");

        Tickets test = new Tickets(sc.nextInt());
        test.discount();

        if(test.getAge() > 18 && test.getAge() < 60){
            System.out.println("Your age is " + test.getAge() +
                    " and your Ticket will be at full price:\n" + test.getValue());
        }else {
            System.out.println("Your age is " + test.getAge() +
                " and your Ticket with discount will be:\n" + test.getValue());
        }

    }
}

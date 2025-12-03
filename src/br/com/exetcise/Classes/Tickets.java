package br.com.exetcise.Classes;

import java.util.Scanner;

public class Tickets {
    private int age;
    private double value;
    Scanner sc = new Scanner(System.in);

    //Constructor method
    public Tickets(int age) {
        this.age = age;
        this.value = 50;
    }


    //Getters and setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getValue() {
        return value;
    }

    //Méthods
    //If the person is bellow 18, the price will be with 10% Discount
    //If the person is older than 60, the price will be with 30% Discount
    //If the person is between 18 and 60, the price will be the full price

    public void discount(){
        if(age <= 18 && age > 0){
            value = value - (value *0.1);
        }
        else if (age >= 60){
            value = value - (value *0.3);
        }

    }

}

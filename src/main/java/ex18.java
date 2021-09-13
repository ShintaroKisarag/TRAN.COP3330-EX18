/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to convert Fahrenheit to Celsius or press 2 to convert Celsius to Fahrenheit ");
        int convert = input.nextInt();  //stores which conversion user wants
        double Fahrenheit,Celsius;  //initializes both temperatures
        switch(convert){
            case 1: System.out.println("Enter Fahrenheit temperature ");
            Fahrenheit = input.nextDouble();    //stores Fahrenheit temperature
            Celsius=(Fahrenheit-32)*5/9;    //Celsius conversion formula
            System.out.println("Celsius temperature is = " +Celsius);
            break;
            case 2: System.out.println("Enter Celsius temperature ");
                Celsius = input.nextDouble();   //stores Celsius temperature
                Fahrenheit=((9*Celsius)/5)+32;  //Fahrenheit conversion formula
                System.out.println("Fahrenheit temperature is = " +Fahrenheit);
                break;
            default: System.out.println("please choose valid choice");
        }
    }
}

package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanners
        int length, width, areaFeet;
        float areaMeters;
        Scanner sc = new Scanner(System.in);

        //Prompt user and scan inputs
        System.out.println("What is the length of the room in feet?");
        length = sc.nextInt();
        System.out.println("What is the width of the room in feet?");
        width = sc.nextInt();
        System.out.println("You entered dimensions of " + length + " by " + width + " feet.");

        //Calculations
        areaFeet = length * width;
        areaMeters = areaFeet * (float) 0.09290304;

        //Output
        System.out.println("The area is \n" + areaFeet + " square feet");
        System.out.println(Math.round(areaMeters*1000)/1000.0 + " square meters");

        //close scanner
        sc.close();
    }
}

package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);//Allows program to grab user input later in code.
        double length = 0.0;
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double volume = 0.0;
        char userInput = ' ';

        while ((userInput != 'n' & userInput != 'N')) { //Let's the program know to continue running unless 'n' or 'N'.
            System.out.println("Enter the length of a room: ");//Prompts user for "length".
            length = scnr.nextDouble();//grabs user input and stores it in the variable "length".

            System.out.println("Enter the width of a room: ");//Prompts for "width".
            width = scnr.nextDouble();//Stores input in the variable "width".

            System.out.println("Enter the height if you wish to know volume. If not, enter 0. ");//Prompts for "height".
            height = scnr.nextDouble();//Stores input into the variable "height".

            area = length * width;//Formula for area.
            perimeter = (length + width) * 2;//Formula for perimeter.
            volume = length * width * height;//Formula for volume.

            System.out.println(area);//Prints the result of the area formula.

            System.out.println(perimeter);//Prints the result of the perimeter formula.

            System.out.println(volume);//Prints the result of the Volume formula.

            System.out.println("Would you like to continue? y/n? ");//Asks the user to input 'y' to keep going or 'n' to stop.
            userInput = scnr.next().charAt(0);//Grabs the first character from what the user enters and applies it to userInput.
            if ((userInput != 'n' & userInput != 'N') && (userInput != 'y' & userInput != 'Y')) {//If user does not input one of these characters
                System.out.println("Not a valid response. Continue? y/n.");//this will print out telling them to re-enter 'y' or 'n'.
                userInput = scnr.next().charAt(0);//Grabs the first character from what the user enters and applies it to userInput.
            }
        }


        System.out.println("Goodbye");//If userInput is 'n' or 'N' the program prints "Goodbye".


    }
}

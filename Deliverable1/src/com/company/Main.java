package com.company;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Boolean;
public class Main {

    public static void main(String[] args) { //Program compares if the sum of the cube's of a numbers digits is equal to itself
                                             //Ex: 153 : 1^3 + 5^3 + 3^3 = 153
        int userNum = 0;                     //Program will print "True" if equals; "False" if not.

        //Prompt the user to input a number. If user input is not a number prompt them again
        System.out.println("Enter a number: ");
        Scanner scnr = new Scanner(System.in);
        while (!scnr.hasNextInt()) { //Tells program to prompt user again if input is not a number
            System.out.println("Enter a number: ");
            scnr.next();
        }

        userNum = scnr.nextInt(); //applies user input to userNum
        deliverableOne( userNum); //communicates the value of userNum to be used in the next method
    }

    public static void deliverableOne(int userNum) { //communicates the previous method's value of userNum into this method
        Boolean doesEqual = true;
        int origNum = 0;  //Will be initialized to the value of userNum for later reference
        double newNum = 0; //Will be used in comparison of origNum to validate if statement is true or false
        origNum = userNum; //Sets a constant value of userNum. Math done in 'while' loop will change value of userNum affecting results


        while (userNum > 0) { //Tells the program to keep running as long as userNum is greater than 0.

            newNum = Math.pow(userNum % 10, 3) + newNum;//Modding to 10 leaves a remainder equal to last digit in userNum. That digit is
            userNum = userNum / 10;                     //  then raised to the 3rd power. In the next line userNum is divided by 10. This allows
        }                                               //  to disregard the remainder that was just used. The loop will continue until there are no
                                                        //  remaining numbers.
        if (origNum == newNum) {
            System.out.println(doesEqual);//Prints "true" if the number originally input is equally to newNum

        } else {
            System.out.println("false");//Prints "false" if not.

        }


    }





    }


package Loops;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        /* Ask user to give a number
        create a multiplication table from 1 to 10 for that given number
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter whole number ");
        int number = scanner.nextInt();

        int multiplier = 1;
        while(multiplier<= 10){
            System.out.println(number+ " * "+ multiplier + " = " +number * multiplier);
            multiplier++;
        }

    }
}

package it.develhope.exceptionshandling;

/**
 * This is a Tester class
 * @author alessiolimina
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        while(true){
            System.out.println("--------------------Starting----------------");

            /**
             * Creating the variables
             * dividend is the first int typed by the user
             * divisor is the second int typed by the user
             * If divisor's not equal to zero, program will do the division
             * Otherwise, the program throws an ArithmeticException, printing an error message to inform the user
             */

            Scanner scanner = new Scanner(System.in);
            System.out.println("Hi! Type a dividend:");
            int dividend = scanner.nextInt();
            System.out.println("Good! You typed " + dividend + ". Now type a divisor:");
            int divisor = scanner.nextInt();
            if(divisor == 0) throw new ArithmeticException("It's impossible to divide by zero!");
            System.out.println("Wait, I'm doing the division...The result is " + (dividend/divisor));

            System.out.println("--------------------Ending-------------------");
        }
    }
}

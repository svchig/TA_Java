package by.epam.module3.lecture1.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Siarhei_Chyhir on 10/23/2015.
 */

public class Calculator {
    public static void main(String[] args){
        double n1 = 0, n2 = 0;
        String operation;
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("This is the simple calculator.");
        System.out.println("You can culculate two values using '+', '-', '*', '/', '^' opetators.");
        System.out.print("Please, add the first value n1: ");
        try {
            n1 = scannerObject.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("The programm will closed due " + e);
            System.exit(1);
        }

        System.out.print("Please, add the operator: ");
        operation = scannerObject.next();

        System.out.print("Please, add the second value n2: ");
        try {
            n2 = scannerObject.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("The programm will closed due " + e);
            System.exit(1);
        }

        switch (operation)  {
            case "+":
                summ(n1, n2);
                break;
            case "-":
                diff(n1, n2);
                break;
            case "/":
                div(n1, n2);
                break;
            case "*":
                multp(n1, n2);
                break;
            case "^":
                invol(n1, n2);
                break;
            default:
                System.out.println("The " + operation + " operation is not supported in this calculator.");

        }
    }

    public static void summ(double n1, double n2){
        System.out.println("The result of " + n1 + " and " + n2 + " adding is " +(n1+n2));
    }

    public static void diff(double n1, double n2){
        System.out.println("The result of " + n1 + " and " + n2 + " subtracting is " +(n1-n2));
    }

    public static void div(double n1, double n2){
        System.out.println("The result of " + n1 + " and " + n2 + " division is " +(n1/n2));
    }

    public static void multp(double n1, double n2){
        System.out.println("The result of " + n1 + " and " + n2 + " multiplying is " +(n1*n2));
    }

    public static void invol(double n1, double n2){
        System.out.println("The result of a " + n1 + " raised to the " + n2 + " power is  " + Math.pow(n1, n2));
    }

}

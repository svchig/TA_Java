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
        System.out.println("You can calculate two values using '+', '-', '*', '/', '^' operators.");
        System.out.print("Please, add the first value n1: ");
        try {
            n1 = scannerObject.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("The program will closed due " + e);
            System.exit(1);
        }

        System.out.print("Please, add the operator: ");
        operation = scannerObject.next();

        System.out.print("Please, add the second value n2: ");
        try {
            n2 = scannerObject.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("The program will closed due " + e);
            System.exit(1);
        }

        switch (operation)  {
            case "+":
                System.out.println("The result of " + n1 + " and " + n2 + " addition is " + getSum(n1, n2));
                break;
            case "-":
                System.out.println("The result of " + n1 + " and " + n2 + " subtracting is " +getDiff(n1, n2));
                break;
            case "/":
                System.out.println("The result of " + n1 + " and " + n2 + " division is " + getDiv(n1, n2));
                break;
            case "*":
                System.out.println("The result of " + n1 + " and " + n2 + "multiplication is " +getMultiply(n1,n2));
                break;
            case "^":
                System.out.println("The result of a " + n1 + " raised to the " + n2 + " power is  " + getInvolving(n1,n2));
                break;
            default:
                System.out.println("The " + operation + " operation is not supported in this calculator.");
        }
    }

    public static double getSum(double n1, double n2){
        return n1+n2;
    }

    public static double getDiff(double n1, double n2){
        return n1-n2;
    }

    public static double getDiv(double n1, double n2){
        return n1/n2;
    }

    public static double getMultiply(double n1, double n2){
        return n1*n2;
    }

    public static double getInvolving(double n1, double n2){
        return Math.pow(n1, n2);
    }

}

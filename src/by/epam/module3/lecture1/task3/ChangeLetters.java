package by.epam.module3.lecture1.task3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Siarhei_Chyhir on 10/26/2015.
 */
public class ChangeLetters {
    public static void main(String[] args){
        byte choice;
        Scanner scannerObject = new Scanner(System.in);
        Random randomGenerator = new Random();
        int rowNumber;
        rowNumber = 0;

        //set the number of rows
        System.out.println("This program changes by places first and last letters in each second string of list or array.");
        System.out.println("If you prefer random number of rows, please, select 1. \nIf you prefer add your number of rows, please, selec 2");

        choice = scannerObject.nextByte();
        if (choice == 1) {
            rowNumber = randomGenerator.nextInt(10) + 1;
            System.out.println("The number of rows is " + rowNumber);
        } else if (choice == 2) {
            System.out.print("Please, add your number of rows: ");
            rowNumber = scannerObject.nextInt();
        }

        //editing strings from console
        Scanner scannerObject1 = new Scanner(System.in);
        String tempString;
        String[] arrString = new String[rowNumber];
        for (int i = 0; i < rowNumber; i++) {
            System.out.println("Please, enter the " + i + " row");
            tempString = scannerObject1.nextLine();
            arrString[i] = tempString.trim();
        }

        //changes by places first and last letters in each second string of list or array
        for (int i = 0; i < rowNumber; i++) {
            if(i%2!=0){
                tempString = arrString[i];
                arrString[i] = tempString.substring(tempString.length()-1) + tempString.substring(1,(tempString.length()-1)) + tempString.substring(0,1);
            }
        }

        //show results of editing
        System.out.println("The result of editing:");
        for (int i = 0; i < rowNumber; i++) {
            System.out.println(arrString[i]);
        }
    }

}

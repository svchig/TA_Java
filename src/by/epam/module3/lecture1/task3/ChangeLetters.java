package by.epam.module3.lecture1.task3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Siarhei_Chyhir on 10/26/2015.
 */
public class ChangeLetters {

    public static void main(String[] args){
        String choice;
        Scanner scannerObject = new Scanner(System.in);
        Random randomGenerator = new Random();
        int rowNumber;

        //set the number of rows
        System.out.println("This program changes by places first and last letters in each second string of list or array.");
        System.out.println("If you prefer random number of rows, please, select 1. \nIf you prefer add your number of rows, please, select any other key");
        choice = scannerObject.nextLine();
        if (choice.equals("1")) {
            rowNumber = randomGenerator.nextInt(10) + 1;
            System.out.println("The number of rows is " + rowNumber);
        } else {
            System.out.print("Please, add your number of rows: ");
            rowNumber = scannerObject.nextInt();
        }

        //adding strings from console
        String[] arrString = new String[rowNumber];
        addingRowData(arrString);


        //changes by places first and last letters in each second string of list or array
        changeFLLetterPlaces(arrString);

        //show results of editing
        showResults(arrString);

    }

    static String[] addingRowData(String[] arrString){
        Scanner scannerObject = new Scanner(System.in);
        String tempString;
        for (int i = 0; i < arrString.length; i++) {
            System.out.println("Please, enter the " + i + " row");
            tempString = scannerObject.nextLine();
            arrString[i] = tempString.trim();
        }
        return arrString;
    }

    static String[] changeFLLetterPlaces(String[] arrString){
        if (arrString.length > 1) {
            for (int i = 0; i < arrString.length; i++) {
                if (i % 2 != 0) {
                    String tempString = arrString[i];
                    arrString[i] = tempString.substring(tempString.length() - 1) + tempString.substring(1, (tempString.length() - 1)) + tempString.substring(0, 1);
                }
            }
        }
        return arrString;
    }

    static void showResults(String[] arrString){
        System.out.println("The result of editing:");
        for (int i = 0; i < arrString.length; i++) {
            System.out.println(arrString[i]);
        }
    }
}

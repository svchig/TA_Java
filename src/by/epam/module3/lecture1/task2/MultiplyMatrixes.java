package by.epam.module3.lecture1.task2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Siarhei_Chyhir on 10/26/2015.
 */
public class MultiplyMatrixes {
    public static void main(String[] args){
        byte choice;
        Scanner scannerObject = new Scanner(System.in);
        Random randomGenerator = new Random();
        int a, b, c;
        a = b = c = 0;

        System.out.println("This program multiplies two matrixes.");

        //Select way to create matrixes
        System.out.println("If you prefer to multiply randomsize matrixes, please, select 1. \nIf you prefer add your sizes, please, selec 2");
        choice = scannerObject.nextByte();
        if (choice == 1) {
            a = randomGenerator.nextInt(10) + 1;
            System.out.println("The 1st matrix number of rows is " + a);
            b = randomGenerator.nextInt(10) + 1;
            System.out.println("The 1st matrix number of column is " + b);
            System.out.println("The 2nd matrix number of rows is " + b);
            c = randomGenerator.nextInt(10) + 1;
            System.out.println("The 2nd matrix number of column is " + c);
        } else if (choice == 2) {
            System.out.print("Please, add the 1st matrix number of rows: ");
            a = scannerObject.nextInt();
            System.out.print("Please, add the 1st matrix number of columns: ");
            b = scannerObject.nextInt();
            System.out.println("The 2nd matrix number of rows is " + b);
            System.out.print("Please, add the 2nd matrix number of columns: ");
            c = scannerObject.nextInt();
        }
        System.out.println("The program will multiply (" + a + "X" + b + ") and (" + b + "X" + c + ") matrixes.");
        System.out.println("The result will be (" + a + "X" + c + ") matrix");

        int[][] matrix1 = new int[a][b];
        int[][] matrix2 = new int[b][c];
        int[][] matrixres = new int[a][c];

        choice = 0;
        System.out.println("If you prefer to use random data in matrixes, please, select 1. \nIf you prefer add your data, please, select 2");
        choice = scannerObject.nextByte();
        if (choice == 1) {
            //add range random data
            int minparam, maxparam;
            minparam = maxparam = 0;
            System.out.println("Could you add please the minimum amd maximum range of data");
            System.out.println("The minimum range of data is ");
            minparam = scannerObject.nextInt();
            System.out.println("The maximum range of data is ");
            maxparam = scannerObject.nextInt();

            //create matrix data random
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    matrix1[i][j] = randomGenerator.nextInt(maxparam - minparam) + minparam;
//                    System.out.println("The " + i + "," + j + " item is " + matrix1[i][j]);
                }
            }
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < c; j++) {
                    matrix2[i][j] = randomGenerator.nextInt(maxparam - minparam) + minparam;
                //    System.out.println("The " + i + "," + j + " item is " + matrix2[i][j]);
                }
            }
        } else if (choice == 2) {
            //Adding data manualy
            System.out.println("Please, add the 1st matrix data.");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print("The " + i + "," + j + " item is ");
                    matrix1[i][j] = scannerObject.nextInt();
                }
            }
            System.out.println("Please, add the 2nd matrix data.");
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("The " + i + "," + j + " item is ");
                    matrix2[i][j] = scannerObject.nextInt();
                }
            }
        }

        //Show 1st matrix
        System.out.println("The 1st matrix data.");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++) {
                System.out.print(" " + matrix1[i][j] + "");
            }
            System.out.println("");
        }

        //Show 2nd matrix
        System.out.println("The 2nd matrix data.");
        for (int i = 0; i < b; i++){
            for (int j = 0; j < c; j++) {
                System.out.print(" " + matrix2[i][j] + "");
            }
            System.out.println("");
        }

        //Multiply matrixes
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < b; k++) {
                    matrixres[i][j] = matrixres[i][j]+ matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        //Show multiply results
        System.out.println("The result of multiply.");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < c; j++) {
                System.out.print(" " + matrixres[i][j] + "");
            }
            System.out.println("");
        }

    }
}

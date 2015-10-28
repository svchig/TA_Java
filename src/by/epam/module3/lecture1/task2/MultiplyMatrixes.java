package by.epam.module3.lecture1.task2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Siarhei_Chyhir on 10/26/2015.
 */
public class MultiplyMatrixes {
    static Scanner scannerObject = new Scanner(System.in);
    static Random randomGenerator = new Random();

    public static void main(String[] args){
        String choice;

        int[] matrixSize;

        System.out.println("This program multiplies two matrices.");

        //Select way to create matrices
        System.out.println("If you prefer to multiply random size matrices, please, select 1. \nIf you prefer add your sizes, please, select any other key");
        choice = scannerObject.nextLine();
        if (choice.equals("1")) {
            matrixSize = getRandomSize();
        } else {
            matrixSize = getCustomSize();
        }
        System.out.println("The program will multiply (" + matrixSize[0] + "X" + matrixSize[1] + ") and (" + matrixSize[1] + "X" + matrixSize[2] + ") matrices.");
        System.out.println("The result will be (" + matrixSize[0] + "X" + matrixSize[2] + ") matrix");

        int[][] matrix1 = new int[matrixSize[0]][matrixSize[1]];
        int[][] matrix2 = new int[matrixSize[1]][matrixSize[2]];
        int[][] matrixres = new int[matrixSize[0]][matrixSize[2]];

        System.out.println("If you prefer to use random data in matrices, please, select 1. \nIf you prefer add your data, please, select any other key");
        choice = scannerObject.nextLine();
        if (choice.equals("1")) {
            //add range random data
            System.out.println("Creation the 1st matrix data.");
            matrix1 = getRandomMatrix(matrix1);
            System.out.println("Creation the 2nd matrix data.");
            matrix2 = getRandomMatrix(matrix2);
        } else {
            //Adding data manually
            System.out.println("Please, add the 1st matrix data.");
            matrix1 = initializeByCustom(matrix1);
            System.out.println("Please, add the 2nd matrix data.");
            matrix2 = initializeByCustom(matrix2);
        }

        //Show 1st matrix
        System.out.println("The 1st matrix data.");
        showMatrix(matrix1);

        //Show 2nd matrix
        System.out.println("The 2nd matrix data.");
        showMatrix(matrix2);

        //Multiply matrices
        matrixres = multiplyMatrices(matrix1, matrix2, matrixres);

        //Show multiply results
        System.out.println("The result of multiply.");
        showMatrix(matrixres);
    }

    static int[] getRandomSize() {
        int a = randomGenerator.nextInt(10) + 1;
        System.out.println("The 1st matrix number of rows is " + a);
        int b = randomGenerator.nextInt(10) + 1;
        System.out.println("The 1st matrix number of column is " + b);
        System.out.println("The 2nd matrix number of rows is " + b);
        int c = randomGenerator.nextInt(10) + 1;
        System.out.println("The 2nd matrix number of column is " + c);
        return new int[]{a, b, c};
    }

    static int[] getCustomSize() {
        System.out.print("Please, add the 1st matrix number of rows: ");
        int a = scannerObject.nextInt();
        System.out.print("Please, add the 1st matrix number of columns: ");
        int b = scannerObject.nextInt();
        System.out.println("The 2nd matrix number of rows is " + b);
        System.out.print("Please, add the 2nd matrix number of columns: ");
        int c = scannerObject.nextInt();
        return new int[]{a, b, c};
    }

    static int[][] getRandomMatrix(int[][] matrix) {
        int minparam, maxparam;
        System.out.println("Could you add please the minimum amd maximum range of data");
        System.out.println("The minimum range of data is ");
        minparam = scannerObject.nextInt();
        System.out.println("The maximum range of data is ");
        maxparam = scannerObject.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = randomGenerator.nextInt(maxparam + 1 - minparam) + minparam;
            }
        }
        return matrix;
    }

    static int [][] initializeByCustom(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("The " + i + "," + j + " item is ");
                matrix[i][j] = scannerObject.nextInt();
            }
        }
        return matrix;
    }

    static void showMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + "");
            }
            System.out.println("");
        }
    }

    static int [][] multiplyMatrices(int[][]matrix1, int[][] matrix2, int[][] matrixres){
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrixres[i][j] = matrixres[i][j]+ matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return matrixres;
    }
}

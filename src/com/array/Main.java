package com.array;

/**
 * Java program to print array that first row has 1 element,
 * second row has 2 elements, third has 3 elements and so on.
 *
 * @autor Julia Marushchenko
 * @version 1.0
 * @since 2025-05-04
 */
public class Main {

    /**
     * This method creates multidimentional array
     * @param number This is number of rows of array
     */
    public static int [][] creatingArray(int number){
        // Declaring array
        int [][] array = new int[number][];

        // Creating array that first row has 1 element,
        // second row has 2 elements, third has 3 elements and so on.
        for (int index = 0; index < array.length; index++){
            array [index]= new  int [index + 1];
        }

        // Filling array with values
        int count = 0;
        for (int index = 0; index < array.length; index++){
            for (int index1 = 0; index1 < array [index].length; index1++){
                array [index][index1] = count++;
            }
        }
        return array;
    }

    /**
     * This method prints multidimentional array
     * @param array This is multidimentional array
     */
    public static void printArray(int [][] array){

        // Printing an array to console
        for (int index = 0; index < array.length; index++) {
            for (int index1 = 0; index1 < array [index].length; index1++){
                System.out.print(array [index][index1] + " ");
            }
            System.out.println();
        }
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Creating array with 7 rows
        int [][] array = creatingArray(7);

        // Printing array
        Main.printArray(array);
    }
}

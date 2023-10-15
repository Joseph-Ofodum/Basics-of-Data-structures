package org.example.arrays;

import java.lang.reflect.Array;

public class ArrayID {

    //a method that fills up a one dimension array in java. and prints it out to the console
    int[] arr1 = new int[20];
    int[][] arr = new int[4][4];
    int count = 1;

    public void Array(){
        for (int i = 0; i < arr1.length; i++){
            arr1[i]= count;
            count++;
        }
        for (int j = 0; j < arr1.length; j++){
            System.out.print(arr1[j]+ " ");
        }
    }

    //2d array

    public void array2D() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

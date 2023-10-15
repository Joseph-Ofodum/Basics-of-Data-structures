package org.example;

import java.lang.reflect.Array;

public class Array2D {

    int[][] arr = new int[4][4];
    int count = 1;

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

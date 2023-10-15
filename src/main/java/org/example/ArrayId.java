package org.example;

import java.lang.reflect.Array;

public class ArrayId {

    //a method that fills up a one dimension array in java. and prints it out to the console
    int[] arr1 = new int[20];
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
}

package org.example.arrays;

import java.util.Arrays;

public class SortingArrays {

    static int[] arr = new int[]{1,22,2,34,56,432,32,33443,1000};

   static int index = searchArr();

   static int key;


    public void sortAGivenArray(){
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

            Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static int searchArr() {
        key= 432;
        int index1 = index;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.print(arr[i] + " key found at index " + index1);
                return i;
            }
        }

        System.out.println("Key not found here");
        return -1;
    }

}

package com.akshet;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static boolean checkArray(int[] array, int start){

        int st=start+1;
        if(st==array.length)
            return true;
        if(array[st-1]>array[st])
            return false;
        return checkArray(array,start+1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of the Array: ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();

        System.out.println("Enter the Elements of the Sorted Array: ");
        int[] array = new int[size];
        // 1 2 3 4 5 6 7 8    1 2 3 5 6 7 8 3    4 5 6 7 1 2
        for(int i=0;i<size;i++)
            array[i]=scan.nextInt();

        System.out.println("Entered Array is: ");
        System.out.println(Arrays.toString(array));

        if(checkArray(array,0))
            System.out.println("Yes the Array is Sorted! ");
        else
            System.out.println("Array is not Sorted! ");

    }
}

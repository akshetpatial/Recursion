package com.akshet;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static int[] sortedArray(int[] array){
        int end= array.length-1;
        int start=1;
        return helperfunction(array,start,end);
    }

    public static int[] helperfunction(int[] array, int start, int end) {
        if(end!=0) {
            if (start == end+1)
                return helperfunction(array, 1, end - 1);
            if (array[start - 1] > array[start]) {
                swap(array, start - 1, start);
            }
            return helperfunction(array, start + 1, end);
        }else
            return array;

    }

    public static int[] swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from]=array[to];
        array[to]=temp;
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of the Array: ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();

        System.out.println("Enter the Elements of the Array: ");
        int[] array = new int[size];
        // 1 2 3 4 5 6 7 8    1 2 3 5 6 7 8 3    1 4 5 6 7 3 2
        for(int i=0;i<size;i++)
            array[i]=scan.nextInt();

        System.out.println("Entered Array is: ");
        System.out.println(Arrays.toString(array));

        int[] sortedArray= sortedArray(array);
            System.out.println("The Sorted Array is: "+Arrays.toString(sortedArray));
    }
}

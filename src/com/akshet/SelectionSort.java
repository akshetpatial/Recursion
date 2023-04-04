package com.akshet;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static int[] sortedArray(int[] array){
        int start=0;
        int end=array.length-1;
        return helperfunction(array, start,end,start);
    }

    public static int[] helperfunction(int[] array, int start,  int end, int max_Index){

            if(end==0)
                return array;

            if (start == end+1) {
                swap(array, max_Index, end);
                return helperfunction(array,0,end-1,0);
            }
            if (array[max_Index] < array[start]) {
                max_Index = start;
            }
            return helperfunction(array, start + 1, end, max_Index);
    }

    public static void swap(int[] array, int from, int to){
        int temp= array[from];
        array[from]=array[to];
        array[to]=temp;
    }


    public static void main(String[] args) {
        System.out.println("Enter the Size of the Array: ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();

        System.out.println("Enter the Elements of the Array: ");
        int[] array = new int[size];
        // 1 2 3 4 5 6 7 8    1 2 3 5 6 7 8 3    1 4 5 6 7 3 2  9 8 7 6 5 4 3 2 1
        for(int i=0;i<size;i++)
            array[i]=scan.nextInt();

        System.out.println("Entered Array is: ");
        System.out.println(Arrays.toString(array));

        int[] sortedArray= sortedArray(array);
        System.out.println("The Sorted Array is: "+Arrays.toString(sortedArray));
    }
}

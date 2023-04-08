package com.SubSequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubSet {

    // Time Complexity is O(N * 2^N) as N levels are there and each level has 2^N subsets
    // Space Complexity is O(2^N * N) same as above
    private static ArrayList<ArrayList<Integer>> SubSetNum(int[] array) {
        ArrayList<ArrayList<Integer>> outerList= new ArrayList<>();
        outerList.add(new ArrayList<>());
        for( int num : array){

            int size = outerList.size();
            //System.out.println(outerList);
            for(int i=0;i<size;i++)
            {
                // This is simple way of using constructor to make the copy of the outerList element present at index i
                // to innerList
                ArrayList<Integer>   integerList = new ArrayList<>(outerList.get(i));
               // System.out.println(integerList);
                integerList.add(num);
                outerList.add(integerList);
               // System.out.println(outerList);
            }
        }
    return outerList;
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of the Array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for(int i =0;i<size;i++)
            array[i]=scan.nextInt();

        System.out.println("Entered Array is "+ Arrays.toString(array));

        ArrayList<ArrayList<Integer>> answer= SubSetNum(array);
        System.out.println("The Sub Set of the given Array is: "+ answer);

    }

}

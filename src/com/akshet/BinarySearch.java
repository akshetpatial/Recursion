package com.akshet;

import java.util.Scanner;

public class BinarySearch {

    // one Way to approach
    public static int BSearchRecur(int[] array, int target, int start, int end){
        if(start>end)
            return -1;
        int mid=start + (end-start)/2;
        if(array[mid]==target)
            return mid;
        else if(array[mid]<target)
            return BSearchRecur(array,target,mid+1,end);
        else
            return BSearchRecur(array,target,start,mid-1);
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the non repeating elements of sorted array: ");
        int[] array=new int[size];
//      2 4 6 9 11 12 14 20 36 48
//      48 36 20 14 12 11 9 6 4 2
        for(int i=0;i<size;i++){
            array[i] = scan.nextInt();
        }

        System.out.println("Entered non repeating element sorted array is: ");
        System.out.print("[ ");
        for(int element : array){
            System.out.print(element+" ");
        }
        System.out.print("]");

        System.out.println("\nEnter the target you want to find: ");
        int target= scan.nextInt();

       int ans= BSearchRecur(array,target,0,size-1);
       if(ans==-1)
           System.out.println("Target "+target+" is not found!");
       else
           System.out.println("Target "+target+ " is found! at the "+ans+"th position.");
    }
}

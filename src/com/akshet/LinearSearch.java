package com.akshet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {

    public static int findTarget(int[] array, int target, int start){

        if(start==array.length)
            return -1;

        if(array[start]==target)
            return start;
        else
            return findTarget(array,target,start+1);

    }

    public static List<Integer> AllOccurrences(int[] array, int target, int start) {

        List<Integer> list = new ArrayList<>();
        if(start==array.length)
            return list;
        if(array[start]==target)
            list.add(start);

        // Here we are not returning the list and
        // At the end of the function we will get the list value that was called at last as list will not get updated here
        // As we are not passing the list as a parameter it is inside the body of the function so it is creating a new list
        // Which does not point to the same object

        // Here the Returned_list contains the values of the previous calls.
        List<Integer>  Returned_list = AllOccurrences(array,target,start+1);
        //From this line onwards we can store or do any manipulation as we are not returning the list yet in the above line
        // So that we can have the values that comes after the end of the stack call

        // So here we are adding the values every time the stack goes out or the call comes back from where it was called
        list.addAll(Returned_list);
        // SO after adding the list to a new everytime until we go to the main function Now we are returning the list
        return list;

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

        System.out.println("Enter the target element you want to find! ");
        int target=scan.nextInt();

        int check= findTarget(array,target,0);
        if(check!=-1)
            System.out.println("Yes target found i.e "+ target + " at index "+ check);
        else
            System.out.println("Target is not found! ");

        System.out.println("Finding all the occurrences of the target: ");

        // We can also pass a list from here as a parameter but we want to find the list without making use of the parameter
        List<Integer> list = AllOccurrences(array,target,0);
        if(list.isEmpty())
            System.out.println("Target not found!");
        else
            System.out.println("Target found i.e. "+target+ " at the positions "+list);
    }

}

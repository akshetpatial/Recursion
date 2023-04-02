package com.akshet;

import java.util.Scanner;

public class ReverseNumber {
    public static void ReversedNumber(int num){
        int temp=num;
        int rNumber=0;
        int rem;
        while(temp>0){
            rem=temp%10;
            rNumber= (rNumber*10) + rem;
            temp=temp/10;
        }
        System.out.println("Using Basic Approach! ");
        System.out.println("The Reverse of the number "+num+" is: "+rNumber);
    }

//    only one parameter should be passed then we pass as many parameters as we want by calling a new function
    public static int ReversedNumberRecursiononeParameter(int num)
    {
        return ReversedNumberRecursion(num,0);
    }

    public static int ReversedNumberRecursion(int num, int rNumber){
        if(num<=0)
            return rNumber;

        int temp=num;
        int rem= temp%10;
        rNumber= rNumber*10 + rem;
        temp=temp/10;

        return ReversedNumberRecursion(temp,rNumber);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int num=scan.nextInt(); // 123456789
        System.out.println("Entered number is: "+ num);

        ReversedNumber(num);

        System.out.println("Using Recursive Approach! ");

       // System.out.println("The Reverse of the number "+num+" is: "+ReversedNumberRecursion(num,0));

        // If its mentioned that only parameter should be passed then
        System.out.println("The Reverse of the number "+num+" is: "+ReversedNumberRecursiononeParameter(num));
    }
}

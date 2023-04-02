package com.akshet;

import java.util.Scanner;

public class SumofDigits {

    public static int sumRecursion(int num){
    int temp =num;
    if(temp<=1){
        return temp;
    }
    int rem = num%10;
    temp= num/10;
    return rem+sumRecursion(temp);
    }

    public static int sum(int num){

        int temp= num;
        int sum =0;
        while(temp!=0){
            int rem= temp%10;
            sum+=rem;
            temp= temp/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of Digits: ");
        System.out.println("Enter the number to find the sum of each digit ");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();

        System.out.println("Using Basic Approach! ");
        System.out.println("The sum of the digits of the number "+num+" is: "+sum(num));

        System.out.println("Using Recursion Approach! ");
        System.out.println("The sum of the digits of the number "+num+" is: "+sumRecursion(num));
    }
}

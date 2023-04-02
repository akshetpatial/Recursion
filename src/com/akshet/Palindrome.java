package com.akshet;

import java.util.Scanner;

public class Palindrome {

    //Global Variable as if we initialize it inside the method then it will initialize every time when the recursive call will take
    // place and Also we do not want to pass it as a variable
    public static int checksum=0;

    public static boolean isPalindrome(int num){
    int temp= num;
    int sum=0;
    while(temp!=0){
        int rem= temp%10;
        sum= sum*10+rem;
        temp=temp/10;
    }
        return sum == num;
    }

    public static int isPalindromeRecursion(int num){
        if(num<=0)
            return checksum;
        int temp= num;
        int rem= temp%10;
        checksum= checksum*10 + rem;
        temp=temp/10;
    return isPalindromeRecursion(temp);
    }

    public static void main(String[] args) {
        System.out.println("Enter any Number to check if it is a palindrome or not: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        boolean check = isPalindrome(input);
        System.out.println("Using Basic Approach!");
        if(check)
            System.out.println(input+ " is a Palindrome");
        else
            System.out.println(input+ " is not a Palindrome");

        int num = isPalindromeRecursion(input);
        System.out.println("Using Recursive Approach!");
        if(num==input)
            System.out.println(input+ " is a Palindrome");
        else
            System.out.println(input+ " is not a Palindrome");
    }
}

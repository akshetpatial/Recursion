package com.akshet;

import java.util.Scanner;

// Using this approach the time complexity is very high to be precise its exponential similar to 2^N as from the Recurrence Relation
// the numbers are getting smaller and smaller by very tiny bit hence the Recursion tree will be very complex
// That is why if we try to find the Fibonacci Series of some bigger position it will stuck even for 50 it will Stuck.
public class FibonacciNumbers {

    // This is one is a bit faster as we are only calling the function one time but still it will break if we try to search the
    // answer of Fibonacci series for the position like 50.
    // More Like a Start to End approach
    public static void NFNumber(int pos, int a , int b, int count){
        if(pos==0 || pos ==1) {
            System.out.println(pos);
            return;
        }
        int sum= a+b;
        count++;
        if(count==pos){
            System.out.println(sum);
            return;
        }
        NFNumber(pos,b,sum,count);
    }

    // More Like a End to Start approach
    public static int NFNumber(int pos){
        if(pos<=1) {
            return pos;
        }else {
                int temp= NFNumber(pos - 1) + NFNumber(pos - 2);
                //Printing this temp just to see the flow
            //System.out.println(temp);
            return temp;
        }
    }

    public static void FNumber(int a, int b, int count){
        int sum= a+b;
        if(count==1)
            System.out.print(a + " "+ b+" ");
        count++;
        if(count==10){
            System.out.println(sum);
            return;
        }
        System.out.print(sum+" ");
        FNumber(b,sum,count);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Numbers: ");
        System.out.println("Enter the position up to which you want to have the Fibonacci Numbers ");
        Scanner scan = new Scanner(System.in);
        int pos=scan.nextInt();
        //One way to look after the logic
        NFNumber(pos,0,1,1);

        //Other way using similar approach but differently
        // We are using method overloading here
        System.out.println("Enter the position up to which you want to have the Fibonacci Numbers ");
        System.out.println(NFNumber(pos));

        System.out.println("Fibonacci Series up to 10th Position");
        FNumber(0,1,1);

    }

}

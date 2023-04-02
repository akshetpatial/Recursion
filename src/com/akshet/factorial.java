package com.akshet;

import java.util.Scanner;

public class factorial {

    public static int fact(int num){

        if(num==1 || num==0) {
            System.out.print(num+ " = ");
            return num;
        }
        System.out.print(num+ " * ");
       // return num*=fact(num-1);
        // or
        return num*fact(num-1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial: ");
        System.out.println("Enter the number up to which you want to have the factorial ");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();

        System.out.println(fact(num));

    }
}

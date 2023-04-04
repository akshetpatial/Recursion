package com.akshet;


import java.util.Scanner;

public class pattern {

    public static void pattern_1(int rows) {
        System.out.println("Pattern 1");
        helperFunction_1(rows, 1, 1);
    }

    public static void helperFunction_1(int rows, int row, int col){

        if(rows==0)
            return;
        if(col<=rows) {
            // Here If we want to reverse the triangle then just print the below line after we make the recursive call that is
            // below the helperFunction();
            System.out.print(" * ");
            helperFunction_1(rows,row,col+1);
        }else{
            System.out.print("\n");
            helperFunction_1(rows-1,row+1,1);
        }
    }

    public static void pattern_2(int rows) {
        System.out.println("Pattern 1");
        helperFunction_2(rows, 1, 1);
    }

    public static void helperFunction_2(int rows, int row, int col){

        if(rows==0)
            return;
        if(col<=rows) {
            helperFunction_2(rows,row,col+1);
            System.out.print(" * ");
        }else{
            helperFunction_2(rows-1,row+1, 1);
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows you want to print the pattern! ");
        Scanner scan = new Scanner(System.in);
        int rows= scan.nextInt();
      /*  *****
          ****
          ***
          **
          *
      */
        pattern_1(rows);

        /*  *
            **
            ***
            ****
            *****
            */
        pattern_2(rows);
    }
}

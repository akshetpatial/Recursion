package com.akshet;

public class Recursion {

    // Space Complexity is high for Recursion as every time we are calling the same function and stack keeps feeling
    // But helps us in breaking out the bigger problems into smaller problems and make the logic easy
    // We can also convert them into iterative approach which have constant space complexity

    // Practical Use case of Recursion where the function is calling other function if the body is same then
    // We can call the same function which is called Recursion.
    static void printW_ORecursion(){
        System.out.println("Print the Number: ");
        printNumber(5);
    }
    static void printNumber(int n){
        System.out.println("The number is: "+ n);
        printNumber1(6);
    }
    static void printNumber1(int n){
        System.out.println("The number is: "+ n);
        printNumber2(7);
    }
    static void printNumber2(int n){
        System.out.println("The number is: "+ n);
        printNumber3(8);
    }
    static void printNumber3(int n){
        System.out.println("The number is: "+ n);
        System.out.println("End!");
    }

    public static void printWithRecursion(int n){
        if(n>8) {
            System.out.println("Program over! ");
            return;
        }
        if(n==5)
            System.out.println("Print the Number: ");
        System.out.println("Print the numbers: "+ n);
        printWithRecursion(n+1);
    }

    public static void main(String[] args) {

        System.out.println("**********\t\t\t\t\tRecursion!\t\t\t\t\t**********");
        //Go to the print function
        //Without Recursion
        printW_ORecursion();
        //With Recursion
        printWithRecursion(5);
    }
}

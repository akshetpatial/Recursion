package com.Permutation;

import java.util.Arrays;
import java.util.Scanner;

public class permuteString {

    public static String[] perSeq(String st){

        return new String[]{""};
    }

    public static void main(String[] args) {
        System.out.println("Write a String to find the Sub Sequences of the String: ");
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();

        System.out.println("Adjacent Sequences of the String "+st+" is : ");
        String[] permutations = perSeq(st);
        System.out.println(Arrays.toString(permutations));
    }
}

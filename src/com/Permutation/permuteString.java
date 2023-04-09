package com.Permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class permuteString {

    public static ArrayList<String> perSeq(String st) {
        return helperFunction(st, "");
    }

    private static ArrayList<String> helperFunction(String given, String ans) {
        ArrayList<String> finalString = new ArrayList<>();

        if (given.length()==0) {
            finalString.add(ans);
           //System.out.println(ans);
            return finalString;
        }

        // Taking the character
        char ch = given.charAt(0);

        // As the recursive call will be equals to size of the ans String +1 ;
        for(int i=0;i<=ans.length();i++){
            // checking the places where we can add the character
            String first = ans.substring(0,i);
            String others = ans.substring(i,ans.length());
            // Only put ans = first+ch+others in the recursive if put in the loop body then when recursive call goes back it
            // Will remain with the  value and will not hold the previous value.
            ArrayList<String> prevString =   helperFunction(given.substring(1), first+ch+others);
            finalString.addAll(prevString);
        }
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println("Write a String to find the Sub Sequences of the String: ");
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();

        System.out.println("Permutation Sequences of the String " + st + " is : ");
        ArrayList<String> permutations = perSeq(st);
        System.out.println(permutations);
    }
}
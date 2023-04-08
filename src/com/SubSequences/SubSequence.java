package com.SubSequences;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {

    // This will give only adj Sequences not Sub Sequences like for a String abc it won't give ac
    public static void adjSeq(String st) {
        helperFunction(st,0);
    }

    public static void helperFunction(String st, int start) {
        int subIndex=0;
        StringBuilder stb = new StringBuilder();
        stb.append(st);

        int endStb= stb.length()-1;

        while(start<=endStb){
            String tempChar="";
            while (subIndex<=endStb){
                if(endStb==0)
                    System.out.print(stb.substring(subIndex));
                else
                    System.out.print(stb.substring(subIndex)+", ");
                subIndex++;
            }
            stb.deleteCharAt(endStb);
            subIndex=0;
            endStb--;
        }
    }

    public static void subSeq(String st) {
        helperFunction_SubSeq(st,"");
    }

    private static void helperFunction_SubSeq(String given, String subStr){

        if(given.length()==0) {
            System.out.print(subStr + " ");
            return;
        }

        char ch = given.charAt(0);

        helperFunction_SubSeq(given.substring(1),subStr+ch);
        helperFunction_SubSeq(given.substring(1),subStr);
    }

    public static void subSeqAL(String st) {
        System.out.println(helperFunction_SubSeqAL(st,""));
    }

    private static ArrayList<String> helperFunction_SubSeqAL(String given, String subStr){
        ArrayList<String> list = new ArrayList<>();
        if(given.length()==0) {
            // Adding here the subStr because then only we can get that in the output when it will return the value back to
            // the recursive function.
            list.add(subStr);
            return list;
        }

        char ch = given.charAt(0);

      ArrayList<String> prevList_1=  helperFunction_SubSeqAL(given.substring(1),subStr+ch);
      ArrayList<String> prevList_2=helperFunction_SubSeqAL(given.substring(1),subStr);
        prevList_1.addAll(prevList_2);
        return prevList_1;
    }

    public static void main(String[] args) {

        System.out.println("Write a String to find the Sub Sequences of the String: ");
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();

        // This will only give adjacent Sequences
        System.out.println("Adjacent Sequences of the String "+st+" is : ");
        adjSeq(st);

        // Recursive Approach of the Sub Sequences
        System.out.println("\nSub Sequences of the String "+st+" is : ");
        subSeq(st);

        // Recursive Approach of the Sub Sequences Returning an Array List
        System.out.println("\nSub Sequences ArrayList of the String "+st+" is : ");
        subSeqAL(st);

    }

}

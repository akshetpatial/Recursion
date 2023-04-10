package com.Permutation;

import java.util.*;

public class LetterCombination {
 //   https://leetcode.com/problems/letter-combinations-of-a-phone-number/

//  This Approach is not working Trying another approach
//    Update 1. Checked others solutions and made some changes to this approach and its working now

    public static List<String> CombinationAnother(String st) {
        List<String>  stringList = new ArrayList<>();
        if(st.isEmpty())
            return stringList;

       Map<String, String> letterString = new HashMap<>();
            letterString.put("1","");
            letterString.put("2","abc");
            letterString.put("3","def");
            letterString.put("4","ghi");
            letterString.put("5","jkl");
            letterString.put("6","mno");
            letterString.put("7","pqrs");
            letterString.put("8","tuv");
            letterString.put("9","wxyz");

        return comWords(0,st,new StringBuilder(),stringList,letterString);

    }

    private static List<String> comWords(int i, String st, StringBuilder stringBuilder, List<String> stringList,Map<String,String> letterString) {
        // This i is for the number of digits we have entered
       /* if(i>=st.length()){
            stringList.add(stringBuilder.toString());
            return stringList;
        }*/

         if(st.length()==0){
            stringList.add(stringBuilder.toString());
            return stringList;
        }

        char ch = st.charAt(0);
        String comb = String.valueOf(ch);
        String str = letterString.get(comb);
        // This loop j is checking length of the each strings for entered digit
        for(int j=0;j<str.length();j++){
            char c = str.charAt(j);
            String val = String.valueOf(c);
            List<String> prev = comWords(i+1,st.substring(1),stringBuilder.append(val),stringList,letterString);
            stringBuilder.deleteCharAt(i);
        }

        return stringList;
    }

    public static List<String> Combination(String st) {
        if(st.isEmpty())
            return new ArrayList<String>();
        return helperFunction(st,"");
    }

    public static List<String> helperFunction(String given, String ans) {
        List<String> temp = new ArrayList<>();
        if(given.length()==0){
            temp.add(ans);
            return temp;
        }

        int start=0;
        int end=0;
        char ch = given.charAt(0);
        // converting the character to int
        int digit = Integer.parseInt(String.valueOf(ch));
        if(digit>1 && digit<7) {
            start = (digit - 2) * 3;
            end= (digit-1)*3;
        }else if(digit==7){
            start = (digit - 2) * 3;
            end= ((digit-1)*3)+1;
        }else if(digit==8){
            start =( (digit - 2) * 3)+1;
            end= ((digit-1)*3)+1;
        }else if(digit==9){
            start = ((digit - 2) * 3)+1;
            end= ((digit-1)*3)+2;
        }
        while(start<end) {
            char present =(char) ('a'+start);
            List<String> prev =  helperFunction(given.substring(1), ans+present);
            temp.addAll(prev);
            start++;
        }
        return temp;
    }


    public static void main(String[] args) {
        System.out.println("Write a String to find the Sub Sequences of the String: ");
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();

        System.out.println("Permutation Sequences of the String " + st + " is : ");
        List<String> permutations = Combination(st);
        System.out.println(permutations);

        List<String> permutationsAnother = CombinationAnother(st);
        System.out.println(permutationsAnother);
    }

}

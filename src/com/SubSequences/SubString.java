package com.SubSequences;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class SubString {

    public static ArrayList<ArrayList<Integer>> findSubstring(int[] given){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<given.length;i++){
            ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
            ArrayList<ArrayList<Integer>> ele = helperFunction(given,i,given.length-1,temp,1);
            ans.addAll(ele);
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> helperFunction(int[] arr, int start, int end, ArrayList<ArrayList<Integer>> temp, int count){
        if( end == start) {
            ArrayList<Integer> a = new ArrayList<>(arr[start]);
            temp.add(a);
            return temp;
        }

        helperFunction(arr,start,end-1,temp,count+1);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =start;i<=end;i++){
            a.add(arr[i]);
//            temp.add(new ArrayList<>(a));
        }
//        System.out.print(a+" ");
//        temp.add(a);
        return temp;
    }

    public static void main(String[] args) {

        int[] given = {1,2,3,4,5};
        ArrayList<ArrayList<Integer>> ans = findSubstring(given);
        int count =1;
        System.out.println(ans);
//        for( ArrayList<Integer> ele : ans){
////            System.out.println("Count: "+count);
//            System.out.println(ele);
////            count++;
//        }
    }
}

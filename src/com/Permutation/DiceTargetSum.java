package com.Permutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceTargetSum {

    /* Do not overthink in such questions just just process and unprocessed approach that is it, if you try to focus more on Dice
    then the solution will become something like below

    public static List<List<Integer>> NoOfTargetSum(int[] dice, int sum) {
        return helperFunction(dice,sum,0,0,0);
    }

    public static List<List<Integer>> helperFunction(int[] dice, int sum, int currSum, int diceVal, int prevSum) {
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> eachList = new ArrayList<>();

        if(dice.length==0){
            if(currSum== sum){
                eachList.add(prevSum);
                eachList.add(diceVal);
            listList.add(eachList);
            }
            return listList;
        }

        for (int i = 0; i < dice.length; i++) {
            List<List<Integer>> prevList = new ArrayList<>();
            diceVal = dice[i];
            if (currSum + diceVal >= sum) {
                prevSum=currSum;
                // Passing a empty array
                prevList  =  helperFunction(new int[]{}, sum, currSum + diceVal, diceVal, prevSum);
            }
            else {
                helperFunction(dice, sum, currSum + diceVal, diceVal, prevSum);
                prevSum=currSum;
            }
            if (currSum + diceVal == sum) {
              listList.addAll(prevList);
            }
            currSum=0;
        }
        return listList;
    }*/

    public static List<String> NoOfTargetSum(int[] dice, int sum) {
      return helperFunction(dice,sum,"");
    }

    public static List<String> helperFunction(int[] dice, int sum, String find) {
        List<String> listList = new ArrayList<>();
        if(sum==0){
           listList.add(find);
           return listList;
        }
        int start= dice[0];
        int end= dice[dice.length-1];
        // This check i<=sum is important as it will prevent sum to be less than 0
        for(int i=start;i<=end && i<=sum;i++){
            List<String> prevListList =  helperFunction(dice,sum-i,find+i);
            listList.addAll(prevListList);
        }
        return listList;
    }

    public static void main(String[] args) {
        System.out.println("Find the number of combinations that matches the target Sum");
        int[] dice = {1,2,3,4,5,6};

        System.out.println("Enter the target Sum: ");
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();

        // No need to pass dice as for a common dice the face values would be from 1 to 6
        List<String> combinations = NoOfTargetSum(dice,sum);
        System.out.println(combinations);
    }

}

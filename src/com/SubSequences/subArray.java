package com.SubSequences;

public class subArray {

    public static void findSubstring(int[] array) {
//        for(int i =0;i<array.length;i++){
//            System.out.print('[');
//            for(int j=i;j<array.length;j++){
//                System.out.print(array[j]+" ");
//            }
//            System.out.print(']');
//        }

        int start = 0;
        int end = 0;

        while(start < array.length) {
            while (end < array.length) {
                if(start <= end)
                    System.out.print('[');
                for (int i = start; i <= end; i++) {
                    System.out.print(array[i] + " ");
                }
                if(start <= end)
                    System.out.print(']');
                end++;
            }
            end = start;
            start++;
        }
    }

    public static void main(String[] args) {
//        int[] given = {1,2,3,4,5};
        int[] given = {5,4,-1,7,8};

        findSubstring(given);
    }
}

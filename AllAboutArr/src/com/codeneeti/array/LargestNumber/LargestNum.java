package com.codeneeti.array.LargestNumber;

import java.util.Scanner;

public class LargestNum {
    static int  []arr=new int[5];
    static void main(String[] args) {
        System.out.println("enter 5 digit" );
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int x:arr){
            System.out.print(" "+x);
        }
        int res=largestNum(arr);
        System.out.println("\n largest number is :"+res);
    }
    private static int largestNum(int[] arrNum){
        int min,max=0;
        min=arrNum[0];
        for (int i = 0; i < 5; i++) {
            if(min<arrNum[i]){
                max=arrNum[i];
            }
        }
        return max;
    }

}

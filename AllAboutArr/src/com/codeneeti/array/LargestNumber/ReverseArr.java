package com.codeneeti.array.LargestNumber;

public class ReverseArr {
    static void main() {
        int[] num1 ={2,3,4,5,6};
        reverse(num1);
        for(int x:num1){
            System.out.println(x);
        }

    }
    private static void reverse(int []arr){
        int s=0;
        int e=arr.length-1;

        for (int i=0;i<arr.length-1;i++){
            if(s>=e){
                return;
            }
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}

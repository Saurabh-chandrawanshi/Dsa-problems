package basicArrayLevel1.intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAbsoluteDifference {
    public static long sumAbsoluteDifferences(int[] arr,int n) {
       int sum =0;
       for (int i =0 ; i<n;i++){
           for (int j=i+1; j<n; j++){
               sum += Math.abs(arr[i]-arr[j]);
           }

       }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array Length ");
        int n = sc.nextInt();
        int arr[] =new int[n];

        for (int i =0; i<arr.length; i++ ){
            arr[i]=sc.nextInt();
        }

        System.out.println(sumAbsoluteDifferences(arr, n));
        sc.close();
    }
}

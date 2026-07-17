package SortingAlorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void Bubblesortf(int []arr, int n){
        for (int i =0 ; i<n-1; i++){
            for (int j=0; j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Array length ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter array element ");
        for (int i = 0 ; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        Bubblesortf(arr,n);
       sc.close();

    }
}

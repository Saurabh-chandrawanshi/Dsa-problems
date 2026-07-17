package SortingAlorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public  static  void Insertionsorting(int arr[],int n){
        for (int i =1; i<n-1 ; i++){
            int key = arr[i],j= i-1;
            while (j>=0 && arr[j]>key ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
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

       Insertionsorting(arr,n);
        sc.close();

    }
}

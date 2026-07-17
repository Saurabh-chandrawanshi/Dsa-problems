package SortingAlorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {
    public static void Selectionsortfunction(int []arr, int n ){
        for (int i =0 ; i<n-1; i++){
            int min =i;
            for (int j =i+1; j<n;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
                if (i!=min){
                    int temp = arr[i];
                    arr[i]= arr[min];
                    arr[min]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length or array");
        int n =  sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array element ");
        for (int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        Selectionsortfunction(arr,n);
        sc.close();
    }
}

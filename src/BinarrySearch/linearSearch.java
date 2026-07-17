package BinarrySearch;

import java.util.Scanner;

public class linearSearch {
    public static int LinearSaerch(int []arr,int n , int target){
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public  static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Length or array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the Elements ");
        for (int i = 0 ; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target");
        int target = sc.nextInt();
        int result = LinearSaerch(arr,n, target);
        if(result == -1){
            System.out.println("Not found");
        }else {
            System.out.println(result+"Found it ");
        }

    }
}

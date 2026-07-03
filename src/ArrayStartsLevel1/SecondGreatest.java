package ArrayStartsLevel1;

import java.util.Scanner;

public class SecondGreatest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();
        int arr[] = new int[n];


        for (int i = 0 ; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int greatest =Math.max(arr[0],arr[1]);
        int secondGreat =Math.min(arr[0],arr[1]);
        for (int i = 2 ; i<arr.length;i++){
            if (arr[i]>greatest){
                secondGreat =greatest;
                greatest =arr[i];
            }else if(arr[i]>secondGreat && arr[i]!=greatest){
                secondGreat =arr[i];

            }
        }
        System.out.println("greatest = "+greatest+" secondGreatest "+ secondGreat );

    }
}

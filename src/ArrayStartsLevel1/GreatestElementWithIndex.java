package ArrayStartsLevel1;

import java.util.Scanner;

public class GreatestElementWithIndex {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int num =0;
        for (int i = 0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int greatest =arr[0];
        int index =0;
        for (int i =0 ; i<arr.length; i++){
           if(arr[i]>greatest) {

               greatest=arr[i];
               index=i;
           }


           }
        System.out.println("Max element = "+greatest+" found at index "+index);
        }


    }


package basicArrayLevel1;

import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];


        for (int i = 0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp = arr[0];
        for (int j= 0 ;j<arr.length-1; j++){
            arr[j]=arr[j+1];

        }
        arr[arr.length-1]=temp;
        for (int j= 0; j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}

package basicArrayLevel1.easy;

import java.util.Scanner;

public class CopyArrayAndReverse {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[arr.length];
        int index = arr.length-1;
        int j ;
        for (int i = 0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for( j=0;  j<arr.length; j++){
            temp[j]=arr[index];
            index--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

package basicArrayLevel1.intermediate;

import java.util.Scanner;

public class LeftShiftByKelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array Length");
        int n = sc.nextInt();
        System.out.println("enter K element for shift____");
        int k=  sc.nextInt();
        int arr[]=new int[n];
         k =k%arr.length;
//        input ke liye
        for (int i= 0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for (int h=0 ; h<k;h++) {
//       shift condition ke liye
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
//output ke liye
        for (int j =0 ;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}

package basicArrayLevel1.intermediate;

import java.util.Scanner;

public class RotateRightByKelement {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Array Length");
        int n = sc.nextInt();
        System.out.println("Enter k Value");
        int k = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        int i = arr.length-1;

       int  l=k%arr.length;
         for (int h=0;h<l;h++) {
             int temp = arr[arr.length - 1];
             for (int j = arr.length-1; j > 0; j--) {
        arr[j] = arr[j-1];

    }
    arr[0] = temp;

}
        for (int j=0 ; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }

}


package basicArrayLevel1;

import java.util.Scanner;

public class RotateRightByKelement {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Array Length");
        int n = sc.nextInt();
        System.out.println("Enter k Value");
        int k = sc.nextInt();

        int arr[] = new int[n];
        k=k%arr.length;
        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i = arr.length-1;
for (int h=1;h<k;h++) {


    int temp = arr[arr.length - 1];
    for (int j = 0; j < arr.length - 1; j++) {
        arr[i] = arr[i - 1];
        i--;
    }
    arr[0] = temp;

}
        for (int j=0 ; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }

}


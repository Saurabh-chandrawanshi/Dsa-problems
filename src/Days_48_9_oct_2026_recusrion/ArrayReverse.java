package Days_48_9_oct_2026_recusrion;

import java.util.Scanner;

public class ArrayReverse {
    public static void reverseArray(int[] arr) {
        reverseArray(arr, 0, arr.length - 1);
    }
    public static void reverseArray(int[] arr, int st, int last) {

        if (st>=last){
            return;
        }
        int temp = arr[st];
        arr[st] = arr[last];
        arr[last] = temp;
        reverseArray(arr, st + 1, last - 1);
    }



public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int arr [] = new int[5];

    for (int i =0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
reverseArray(arr , 0 ,arr.length-1);
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
}


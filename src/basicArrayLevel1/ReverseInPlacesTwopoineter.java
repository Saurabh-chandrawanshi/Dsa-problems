package basicArrayLevel1;

import java.util.Scanner;

public class ReverseInPlacesTwopoineter {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        int i =0 ,j= arr.length-1;

        for (int r = 0; r<arr.length;r++){
            arr[r]=sc.nextInt();
        }
        for (int h=0 ; h<arr.length-1;h++){
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
            j--;
            i++;
        }
        for (int k =0 ; k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

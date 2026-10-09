package Days_48_30_sept_2026;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringSortig {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your String");
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int n = arr.length;
        for (int i =0 ; i<n-1; i++){
            for (int j =0 ; j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp = arr[j];
                    arr[j ]= arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        String ans = " ";
        for (int i = 0 ; i<arr.length;i++){
            ans +=arr[i]+" ";
        }
        System.out.println(ans);
    }
}

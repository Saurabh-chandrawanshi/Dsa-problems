package ArrayStartsLevel1;

import java.util.Scanner;

public class sortArray {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean isSorted = true;
        for (int i =0 ;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0 ; i<arr.length-1; i++){

            if (arr[i+1]<arr[i]){
                isSorted =false;
                break;
            }
        }
       if(isSorted){
           System.out.println("YES");
       }else {
           System.out.println("NO");
       }
    }
}

package basicArrayLevel1;

import java.util.Scanner;

public class MoveNegativeLeft {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Length");

        int n = sc.nextInt();
        int arr[]=new int[n];



        for (int t = 0 ;t<arr.length; t++){
            arr[t]=sc.nextInt();
        }
        int i=0, j=0;
       while (i<arr.length) {
           if (arr[i] < 0) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
           }
           i++;
       }

            for (int u =0; u<arr.length; u++){
                System.out.print(arr[u]+" ");
            }
        }
    }


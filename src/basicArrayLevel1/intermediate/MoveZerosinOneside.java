package basicArrayLevel1.intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosinOneside {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Your array Length ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=new int[n];
        int index=0;
        for (int j =0; j<arr.length;j++){
            if (arr[j]!=0){
                int temp=arr[j];
                arr[j]=ans[index];
                ans[index]=temp;
                index++;
            }


            }
            System.out.println(Arrays.toString(ans));
        }
    }


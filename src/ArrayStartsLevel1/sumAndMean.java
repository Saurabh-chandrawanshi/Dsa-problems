package ArrayStartsLevel1;

import java.util.Scanner;

public class sumAndMean {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum=0;
        for (int i =0 ; i<arr.length;i++){
            System.out.println("Enter the "+i+" value or Array");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        float mean = sum/arr.length;
        System.out.println("sum : "+sum);
        System.out.println("mean : "+mean);
    }
}

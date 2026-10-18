package recursion.Days_48_3_oct_2026.Days_48_18_oct_2026_recurtion;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfDigits {
    public  static int SumOfDigitss(int n){
        if (n==0) return 0;


        return n%10 + SumOfDigitss(n/10);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();

        int sum = SumOfDigitss(n);
        System.out.println(sum);
        sc.close();
    }
}

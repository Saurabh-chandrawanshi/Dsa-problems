package Days_48_9_oct_2026_recusrion;

import javax.xml.transform.Source;
import java.util.Scanner;

public class SumOfNumbers {
    public static int Sum1ToN(int n ){

        if( n <= 1)return 1;

      return n+Sum1ToN(n-1);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println(Sum1ToN(n));
        sc.close();
    }
}

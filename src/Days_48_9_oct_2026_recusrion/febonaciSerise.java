package Days_48_9_oct_2026_recusrion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class febonaciSerise {
    public static int fib(int n, int start , int end) {
           if (n ==0)return 0;

           int sum = start+end;
        System.out.println(sum+" ");
        fib(n-1,end,sum);
        return 0;
//        second method
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//
//        // Recursive Relation: F(n) = F(n-1) + F(n-2)
//        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ");
        int n = sc.nextInt();
        System.out.println( fib(n,0,1) );
        sc.close();
    }
}

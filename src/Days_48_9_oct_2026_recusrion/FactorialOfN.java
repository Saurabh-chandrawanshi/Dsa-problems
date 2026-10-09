package Days_48_9_oct_2026_recusrion;

import java.util.Scanner;

public class FactorialOfN {
    public static int Facto(int n){
        if(n <=1) return 1;
        return n* Facto(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        System.out.println( Facto(n));
        sc.close();
    }
}

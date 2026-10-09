package Days_48_9_oct_2026_recusrion;

import java.util.Scanner;

public class PrintHello {
    public static void print(int n){
        if (n==0)return;
        System.out.println("hello");
        print(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}

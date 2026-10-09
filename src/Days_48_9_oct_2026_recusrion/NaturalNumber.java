package Days_48_9_oct_2026_recusrion;

import java.util.Scanner;

public class NaturalNumber {
    public static void NaturalNum(int n ){
        if (n==0)return;

        NaturalNum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NaturalNum(n);
        sc.close();
    }
}

package recursion.Days_48_3_oct_2026.Days_48_18_oct_2026_recurtion;

import java.util.Scanner;

public class ReverceDigits {
    public static int revers(int n ,int rever){
        if (n==0) return rever;
        return revers(n/10, (rever*10)+(n%10));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your digits");
        int n = sc.nextInt();
        int rever =0;
        int result = revers(n , rever);
        System.out.println(result);
        sc.close();
    }
}

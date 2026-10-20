package recursion.Days_48_3_oct_2026.Days_48_19_oct_2026_recursion;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean IsPOWER(int n){
        if (n<=0) return false;
        if (n==1)  return true;
        if (n%2 !=0) return false;

     return IsPOWER(n/2);




    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();
      Boolean sum =  IsPOWER(n);
        System.out.println(sum);
        sc.close();
    }
}

package whileloop;

import java.util.Scanner;
//ek number ka usquare karte hai jo value ai unko apas me jod lete hai agar uska sum diy gay numbe ke bara bar hua to vo true hota hai
public class neonnumber {
    public static String checkNeon(int n) {

        int sqaur = n*n ; // 9*9 = 81

        int sum =0 ;
        String ss="No";
        while (sqaur!= 0){

            int digit = sqaur%10; // 81%10 =1
             sum +=digit; // 1
             sqaur=sqaur/10;//81/10 =8

        }

        if (n==sum){
            ss ="Yes";

        }
        return ss;
    }

//       9*9 = 81
//               8+1 =9
//                       9==9
//                               yes
public  static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number ");
    int n = sc.nextInt();

  String s = checkNeon(n);
    System.out.println(s);
    sc.close();
}

}

package whileloop;

import java.util.Scanner;

public class parfectsquare {
    public static String isPerfectSquare(int n){
      int A = 1 ;
      int num = n;
String ss = "No";
      while (A <=num){
          int sum = (A+num)/2;
         long Sup = sum * sum;
          if (Sup == n){
              ss = "Yes";
              System.out.println(sum);
              break;
          }else if(Sup < n){
             A = sum +1;

          }else {
              num = sum-1;
          }

      }
          return ss;
        }



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();
       String s = parfectsquare.isPerfectSquare(n);
        System.out.println(s);
    }

}

package loopStatement;

import java.util.Scanner;

public class Divisorfinder {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("enter your number = ");
       int n = sc.nextInt();
       System.out.println("Enter your x Value = ");
       int x = sc.nextInt();

       int count=0;
       for (int i = 1 ; i<=n ; i++){
           int count2=0;
           for (int j=1 ; j<=i ; j++){
               if (i%j==0){
                   count2++;
               }
               if (count2==x){
                   count++;
               }

           }

       }
       System.out.println(count);
    }
}

package loopStatement;

import java.util.Scanner;

public class PrimeFactore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int n = sc.nextInt();
        String count =" " ;

          if (n==0 && n==1){
              System.out.println(" No prime factors");
          }else {
              for (int i = 2; i<=n; i++){
                  for (; n%i==0; n=n/i){
                      count=count + i +" ";
                  }
              }
              System.out.println(count);
          }

          }
    }


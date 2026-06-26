package whileloop;

import java.util.Scanner;

public class Abundendnumber {
    public String checkAbundant(int n) {
         long A = 1;
         long num =0;
         String sum ="No";
         while (A<n){
             if (n%A==0){
                 num += A;
                 sum="Yes";
             }
             A++;
         }
      if (num>n){
          System.out.println("yes");
      }else {
          System.out.println("no");
      }

return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();
        Abundendnumber obj = new Abundendnumber();
        obj.checkAbundant(n);
    }
}

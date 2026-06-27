package whileloop;

import java.util.Scanner;
// (International Standard Book Number) is a unique 13-digit identifier assigned to published books
//isme 10 digit ko 1 se lekar  10 tak ki position ke according divide karke sum karte hai  or 11 se modulo karte hai agr vo number 0 hai to valid nhi to invalid
public class validisbnnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter youe 10 digit isbn number ");
        long n = sc .nextLong();
        long  number = n;
        int num=10;
        long digit =0;
      long sum =0;
      int count =0;

        while (n!=0){
          digit = n %10;
           sum  += (digit * num);
           num--;
           count++;
            n =n/10;
        }
        if (count!=10){
            System.out.println("false");
        }else {
            if (sum%11==0) {
                System.out.println("ture");
            } else {
                System.out.println("false");
            }
        }
    }
}

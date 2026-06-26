package whileloop;

import java.util.Scanner;

public class hcfofTwonumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first number ");
        long A = sc.nextLong();
        System.out.println("enter your second number ");
        long B = sc.nextLong();
        long num;
       if(A<0 && B<0){
           System.out.println("Invalid");

           }else {
           if(A<B){
              num =  A;
           }else {
             num = B;
           }
           while (num!=0){
               if (A%num ==0 && B%num==0){
                   System.out.println(num);
                   break;
               }

               num--;
           }
       }

    }
}

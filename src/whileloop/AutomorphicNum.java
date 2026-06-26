package whileloop;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();//25
       int sqare = n*n;//625
        String val = "";
boolean isvalue = false;
        while (sqare!=0){   //625 >0
           int digit = sqare%10;  // 5
           String str =String.valueOf(digit); // "5"
            val = str+val;
            int sum = Integer.parseInt(val); // sum = 5
            if (n == sum){
               isvalue= true;
               break;
            }
           sqare = sqare/10;
        }
        if (isvalue){
            System.out.println("Yes ");
        }else {
            System.out.println("No");
        }
    }
}

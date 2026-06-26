package whileloop;

import java.util.Scanner;

// 18= 1+8 = 9 and 18/9==0 that is true
public class harshedNumberCheck {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter you number ");
        int n = sc.nextInt();
        int sum=0;
        while (n!=0){
            int num = n%10;
            sum += num;
            n=n/10;
        }
       if (n%sum==0){
           System.out.println("Yes");
       }else {
           System.out.println("No");
       }

    }
}

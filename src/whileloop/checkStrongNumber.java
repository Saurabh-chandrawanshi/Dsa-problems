package whileloop;

import java.util.Scanner;

public class checkStrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        int number = n;

        int sum=0;
        while (n!=0){

            int num = n%10;
            int fact =1;
            for (int i = 1 ; i<=num; i++){
                fact = fact*i;
            }
            n=n/10;
            sum+=fact;
        }

        if (number==sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }



    }
}

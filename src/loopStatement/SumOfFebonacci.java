package loopStatement;

import java.util.Scanner;

public class SumOfFebonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter your number = ");
        int n = sc.nextInt();

        int limit = 2*n;
        int a =0;
        int b=1 ;
        int c = 0;
        int sum=0;

        for (int i =0 ; i<=limit; i++){
            if(i%2==0 && i!=0){
                sum = sum + a;
            }
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(sum);
    }
}

package loopStatement;

import java.util.Scanner;

public class fabnociSerice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number = ");
        int num = sc.nextInt();
        int A =0 ;
        int B=1;
        int c=0;
        for (int i= 1 ; i<=num ; i++){
            System.out.print(A+" ");
         c= A+B;
         A=B;
         B=c;

        }
    }
}

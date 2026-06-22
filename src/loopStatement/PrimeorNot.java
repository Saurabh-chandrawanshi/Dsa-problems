package loopStatement;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number = ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1 ; i<=num; i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Is prime number");
        }else {
            System.out.println("Is not prime number");
        }


    }
}

package dowhileloop;

import java.util.Scanner;

public class printhello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");

        int n ;
        do {

            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Hello");
            }
        }
        while (n == 1);
    }

}

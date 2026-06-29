package patterndrow;

import java.util.Scanner;

public class pyramidstar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int h = 1; h <= i; h++) {
                System.out.print("*");
                if (h != i) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

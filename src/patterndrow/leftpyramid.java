package patterndrow;

import java.util.Scanner;

public class leftpyramid {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();

        for (int i = 1 ; i<=n ; i++){
            for (int j = i; j<=n-1; j++){
                System.out.print("  ");
            }
            for (int h = 1 ; h<=i; h++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

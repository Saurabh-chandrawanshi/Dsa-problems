package patterndrow;

import java.util.Scanner;

public class alfabetprint {
    public static void mian(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your input ");
        int n = sc.nextInt();

        for (int i =1; i<=n ; i++){
            char ch = 'A';
            for (int j= 1; j<=i ; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

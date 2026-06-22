package loopStatement;

import java.util.Scanner;

public class powercalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int A = sc.nextInt();
        System.out.println("Enter the Power = ");
        int B = sc.nextInt();
        int result = A;
        for (int i = 1; i < B; i++) {
            result = result * A;

        }
        System.out.println(result);
    }
}

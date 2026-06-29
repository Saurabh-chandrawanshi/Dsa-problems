package dowhileloop;

import java.util.Scanner;

public class GuessGame {

    // Secret Number
    int pick = (int)Math.random()*10;

    int guess(int num) {

        if (num == pick) {
            return 0;
        } else if (num > pick) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Solution extends GuessGame {

    public int guessNumber(int n) {

        int A = 1;
        int B = n;

        do {
            int pick = (int)Math.random()*10;
            int mid = A + (B - A) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                B = mid - 1;
                System.out.println("Its High");
            } else {
                A = mid + 1;
                System.out.println("Its Low");
            }

        } while (A <= B);

        return -1;
    }

    public static void main(String[] args) {

        System.out.println("--- This is a Game ---");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maximum Number : ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        int ans = obj.guessNumber(n);

        System.out.println("Guessed Number = " + ans);

        sc.close();
    }
}
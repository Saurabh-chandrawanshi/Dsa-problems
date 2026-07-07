package basicArrayLevel1.intermediate;

import java.util.Scanner;

public class MinimumOfTwoArray {


        public static int minABc(int[] A, char[] B) {

            int n = A.length;

            if (n < 3) {
                int min = A[0];
                for (int i = 1; i < n; i++) {
                    min = Math.min(min, A[i]);
                }
                return min;
            }

            int minA = Integer.MAX_VALUE;
            int minB = Integer.MAX_VALUE;
            int minC = Integer.MAX_VALUE;

            boolean hasA = false;
            boolean hasB = false;
            boolean hasC = false;

            for (int i = 0; i < n; i++) {

                if (B[i] == 'a') {
                    minA = Math.min(minA, A[i]);
                    hasA = true;
                }

                else if (B[i] == 'b') {
                    minB = Math.min(minB, A[i]);
                    hasB = true;
                }

                else if (B[i] == 'c') {
                    minC = Math.min(minC, A[i]);
                    hasC = true;
                }
            }

            long ans = Long.MAX_VALUE;

            if (hasA && hasB) {
                ans = Math.min(ans, (long) minA + minB);
            }

            if (hasC) {
                ans = Math.min(ans, (long) minC);
            }

            return ans == Long.MAX_VALUE ? -1 : (int) ans;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit ");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println("enter your number");
            int n = sc.nextInt();

            int[] A = new int[n];
            char[] B = new char[n];

            // Integer array input
            for (int i = 0; i < n; i++) {
                System.out.println(i+"value of A");
                A[i] = sc.nextInt();

            }

            // Character array input
            for (int i = 0; i < n; i++) {
                System.out.println(i+"value of B");
                B[i] = sc.next().charAt(0);

            }

            System.out.println(minABc(A, B));
        }

        sc.close();
    }
}

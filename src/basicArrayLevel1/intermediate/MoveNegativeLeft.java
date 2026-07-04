package basicArrayLevel1.intermediate;

import java.util.Scanner;

public class MoveNegativeLeft {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {

                int temp = arr[i];
                int k = i;

                // Elements ko right shift karo
                while (k > j) {
                    arr[k] = arr[k - 1];
                    k--;
                }

                // Negative element ko uski position par rakho
                arr[j] = temp;
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
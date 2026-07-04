import java.util.Arrays;
import java.util.Scanner;

public class TwoSumSubArray {

    public static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }

            }

        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Length");
        int n = sc.nextInt();

        System.out.println("Enter Target");
        int target = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}
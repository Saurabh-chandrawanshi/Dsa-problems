package basicArrayLevel1.intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArray {

    // Function to build the new array
    public static int[] buildArray(int[] nums, int n) {
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number Of Test Cases:");
        int t = sc.nextInt();

        while (t-- > 0) {

            System.out.println("Enter The Length Of Array:");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.println("Enter Array Elements:");// array ki element ki limit fix karta hai agar me length 5 deta hu to mujhe sare elemnet 5 se niche rakhne honge
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result[] = buildArray(arr, n);

            System.out.println(Arrays.toString(result));
        }

        sc.close();
    }
}
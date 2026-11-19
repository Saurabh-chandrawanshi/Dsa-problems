package ArrayStartsLevel1;

import java.util.Scanner;

public class MissingNumbers {
    public static int missingNumber(int[] nums, int limit) {
        int n = limit;
        int sum = 0;
        for (int i =0 ; i<nums.length; i++){
            sum += nums[i];
        }
        int result = n*(n+1)/2;

        int solve = result-sum;
      return solve;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array limit ");
        int limit = sc.nextInt();
        System.out.println("enter Array Element ");
        int nums[] = new int[limit];
        for (int i = 0 ; i<nums.length; i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(  missingNumber(nums,limit));
        sc.close();
    }
}

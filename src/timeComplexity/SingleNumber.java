package timeComplexity;

import java.util.Scanner;

public class SingleNumber {
    public static int SingleNumbers(int [] nums){
        int count =0;

        for (int i =0; i<nums.length; i++){
         count = count^nums[i];

        }
        return count;
    }

   public static void main(String[] args){

      int [] nums={1,2,2,1,3};
      int result = SingleNumbers(nums);
       System.out.println(result);

   }
}

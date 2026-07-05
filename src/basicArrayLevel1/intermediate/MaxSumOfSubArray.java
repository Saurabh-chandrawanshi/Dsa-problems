package basicArrayLevel1.intermediate;

import java.util.Scanner;

public class MaxSumOfSubArray {
    public static int maxSubArraySum(int arr[]) {
       int sum =0;
       int max = Integer.MIN_VALUE;

       for(int i = 0 ; i<arr.length;i++){
           sum=+arr[i];
           if(sum>max){
               max=sum;
           }
           if (sum<0){
               sum=0;
           }

       }
return max;
    }
    public static void main(String[] args){



       int arr[] ={1,-1,2,-2,3,-3,4,-5,-6,7,-8,9,11};
//       MaxSumOfSubArray.maxSubArraySum(arr);
      int result = maxSubArraySum(arr);
        System.out.println(result);
    }
}

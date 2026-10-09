package Days_48_6_oct_2026;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumm {
    public static int[] towsum(int[] nums , int target){
        HashMap <Integer,Integer>map = new HashMap<>();
        for (int i = 0 ; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};

            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter your array");
        int [] nums = new int[10];
        for (int i = 0 ; i< nums.length; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        System.out.println(towsum(nums,target));
        sc.close();
    }
}

package ArrayStartsLevel1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ContainDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i<nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Arr limit");
        int limit = sc.nextInt();
        int nums [] = new int[limit];
        for (int i = 0 ; i <nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println( containsDuplicate(nums));
        sc.close();
    }
}

import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int j =0 ;
        for (int i =0 ; i<nums.length; i++){
            if (nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
         return j+1;
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array ");
        int n = sc.nextInt();

        int nums[]=new int[n];
        System.out.println("Enter Element of array");
        for (int i =0 ; i<nums.length; i++){
            nums[i]=sc.nextInt();
        }

        int result = removeDuplicates(nums);

        System.out.println(result);
        sc.close();
    }
}

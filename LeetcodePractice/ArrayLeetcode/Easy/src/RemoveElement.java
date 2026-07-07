import java.util.Scanner;

public class RemoveElement {
    public static int removeDuplicates(int[] nums,int val) {
        if (nums.length==0){
            return 0;
        }
        int j =0 ;
        for (int i =0 ; i<nums.length; i++){
            if (nums[i]!=val){

                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array ");
        int n = sc.nextInt();
        System.out.println("enter the value to remove in  array ");
        int val = sc.nextInt();

        int nums[]=new int[n];
        System.out.println("Enter Element of array");
        for (int i =0 ; i<nums.length; i++){
            nums[i]=sc.nextInt();
        }

        int result = removeDuplicates(nums,val);

        System.out.println(result);
        sc.close();
    }
}

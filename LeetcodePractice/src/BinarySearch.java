import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] arr, int Target) {
        int start = 0;
        int end=arr.length-1;
//    binary search me for loop nhi lagta hai while lagta hai
        while(start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]==Target){
                System.out.println("Your Target is reached index "  +mid+" Target "+Target );
                break;
            }
            if (arr[mid]<Target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
//    Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
public  static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entr array length ");
    int n = sc.nextInt();

    int arr [] =new int[n];

    for (int i = 0 ; i<arr.length; i++){
        System.out.println("Enter Element or Array ");
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter Target ");
    int Target = sc.nextInt();


int result = search(arr,Target);

    System.out.println(result);

    
}

}

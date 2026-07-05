import java.util.Scanner;

public class ConactinateArray {

    // Function to create concatenated array
    public static int[] concatenateArray(int arr[]) {
        int n = arr.length; //array ki length n me stor

        int sum[] = new int[2 * n];// ans array ki lenth 2*n kar diya
//Yaha Par 2 Pointer KI Tarah Kam Kiya Ja Raha Hai Isme Sum ke Ander Arr[i] KO sotre Kar Rahe Hai
        for (int i = 0; i < n; i++) {
            sum[i] = arr[i];       // First half
            sum[i + n] = arr[i];   // Second half
        }

        return sum;
    }

    // Function to print array
    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Array ");
        int t = sc.nextInt();   // Number of test cases

        while (t-- > 0) {
            System.out.println("Enter the Length Of Array");
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result[] = concatenateArray(arr);

            printArray(result);

            System.out.println();
        }

        sc.close();
    }
}
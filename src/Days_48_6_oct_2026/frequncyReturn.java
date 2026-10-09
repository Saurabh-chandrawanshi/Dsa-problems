package Days_48_6_oct_2026;

import java.util.HashMap;
import java.util.Scanner;

public class frequncyReturn {
    public static HashMap FrequncyEACH(int arr[]){
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

           map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for (int i:map.keySet()){
            if ( map.get(i) == 1){
                System.out.print(i+" ");
            }
        }
        return map;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input in Array");
        int arr[]  = new int[10];

        for (int i = 0 ; i < arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(FrequncyEACH(arr));
        sc.close();
    }
}

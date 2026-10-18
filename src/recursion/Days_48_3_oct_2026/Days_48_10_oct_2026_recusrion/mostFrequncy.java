package recursion.Days_48_3_oct_2026.Days_48_10_oct_2026_recusrion;

import java.util.HashMap;
import java.util.Scanner;

public class mostFrequncy {
    public static int frequnt(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0; i<arr.length; i++){
            if (arr[i]%2==0){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        int mostFrequnt =0 , ans=-1;
        for (int key : map.keySet()){
            if (map.get(key)>mostFrequnt){
                mostFrequnt = map.get(key);
                ans = key;

            } else if (map.get(key)== mostFrequnt) {
                ans = Math.min(key,ans);

            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arr limit");
        int limit = sc.nextInt();
        System.out.println("Enter your array element");
        int arr[] = new int[limit];
        for (int i =0 ;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(frequnt(arr));
        sc.close();
    }
}

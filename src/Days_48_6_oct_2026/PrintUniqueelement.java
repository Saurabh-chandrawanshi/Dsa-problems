package Days_48_6_oct_2026;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintUniqueelement {
    public  static List<Integer> printUnique(int[] arr) {
      HashMap<Integer,Integer> map = new HashMap<>();
       ArrayList<Integer> Listt= new ArrayList<>();
        for (int i =0 ; i<arr.length; i++){

               map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
for (int key : map.keySet()){
    if (map.get(key)==1){
       Listt.add(key);
    }
}
return Listt;

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int arr[] =new int[10];
        for (int i =0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(printUnique(arr));

    }
}

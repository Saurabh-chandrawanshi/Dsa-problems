package recursion.Days_48_3_oct_2026.Days_48_10_oct_2026_recusrion;

import java.util.Arrays;
import java.util.Scanner;

public class SortPeople {
public String[] SortPeoplee(String[] name , int[] height){
    int n = name.length-1;
    for (int i =0; i<n-1;i++){
        for (int j = i; j<n-i-1;j++){
            if (height[j]<height[j+1]){
                int tempheigth = height[j];
                height[j]= height[j+1];
                height[j+1]= tempheigth;

                String tempName = name[j];
                name[j]= name[j+1];
                name[j+1]=tempName;
            }
        }
    }
    return name;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the names or people");

    String [] names = new String[5];
    for (int i = 0; i<names.length; i++){
        names[i]= sc.nextLine();
    }
    System.out.println("Enter the names or people-height");

    int [] height = new int[5];
    for (int i = 0; i<height.length; i++){
        height[i]= sc.nextInt();
    }
    SortPeople obj = new SortPeople();
    String result[] = obj.SortPeoplee(names,height);
    System.out.println("Sorted names: " + Arrays.toString(result));
    sc.close();
}
}

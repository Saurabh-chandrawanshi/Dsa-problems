package Days_48_4_oct_2026;

import java.util.ArrayList;
import java.util.Scanner;

public class jewelsandStone {
    public  static int jewelsFunction(String Stone , String jewels){
        ArrayList <Character> set = new ArrayList<>();
        int count =0;
        for (int i =0; i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        for (int i =0; i<Stone.length(); i++){

            if (set.contains(Stone.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Stone");
        String Stone = sc.nextLine();
        System.out.println("Enter your jewels");
        String jewels = sc.nextLine();
        System.out.println(jewelsFunction(Stone,jewels));
    }
}

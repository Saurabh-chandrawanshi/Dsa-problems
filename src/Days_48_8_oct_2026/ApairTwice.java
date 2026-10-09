package Days_48_8_oct_2026;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ApairTwice {
    public char repeatedCharecter(String s){
        HashSet<Character> set =new HashSet<>();
        for (int i =0; i<s.length();i++){
            if (set.contains(s.charAt(i))){
                return s.charAt(i);
            }else {
                set.add(s.charAt(i));
            }
        }
           return ' ';
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String s = sc.nextLine();
        ApairTwice obj = new ApairTwice();
       char result = obj.repeatedCharecter(s);
        System.out.println(result);
        sc.close();
    }
}

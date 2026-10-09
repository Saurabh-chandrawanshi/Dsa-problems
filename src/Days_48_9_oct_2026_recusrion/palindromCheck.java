package Days_48_9_oct_2026_recusrion;

import java.util.Scanner;

public class palindromCheck {
    public static String isPalindrome(String s) {
    int start =0;
    int end = s.length()-1;

    if(s.charAt(start) != s.charAt(end)){
        return " No ";
    }

return "Yes";
    }
    public  static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println( isPalindrome(s));
        sc.close();
    }
}

package String;

import java.util.Scanner;

public class PalindromeString {
    public boolean isPalindrome(String s){
        int start = 0 ;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)) return false;
            else start++; end--;

        }
 return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String ");{
            String Str = sc.nextLine();
            PalindromeString obj = new PalindromeString();
           boolean b =  obj.isPalindrome(Str);
            System.out.println(b);
            sc.close();
        }
    }
}

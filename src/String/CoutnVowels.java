package String;

import java.util.Scanner;

public class CoutnVowels {
    public void countVowelConsonant(String s){
       int c=0,v=0, sp =0;
       for (int i = 0 ;i<s.length(); i++){
           int ch = s.charAt(i);
           switch (ch){
               case 'a','i','o','e','u' -> v++;
               case " " -> sp++;
               case   -> c++;
           }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your String ");
        String str = sc.nextLine();
        CoutnVowels obj = new CoutnVowels();
         int result = obj.countVowelConsonant(str);
        System.out.println(result);
        sc.close();
    }
}

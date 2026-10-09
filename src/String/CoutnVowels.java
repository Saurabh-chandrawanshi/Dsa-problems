package String;

import java.util.Scanner;

public class CoutnVowels {
    public static void  countVowelConsonant(String s){
       int c=0,v=0, sp =0;
       for (int i = 0 ;i<s.length(); i++){
           int ch = s.charAt(i);
           switch (ch){
               case 'a','i','o','e','u' :
                   v++;
                   break;
               case ' ' :
                   sp++;
                   break;
               default:
                   c++;
           }
        }
        System.out.println("Cherecter "+c);
        System.out.println("Vowels "+v);
        System.out.println("Space "+sp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your String ");
        String str = sc.nextLine();
        countVowelConsonant(str);

        sc.close();
    }
}

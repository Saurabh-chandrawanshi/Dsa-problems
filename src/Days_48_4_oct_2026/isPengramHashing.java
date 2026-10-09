package Days_48_4_oct_2026;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class isPengramHashing {
    public static boolean IsPangram(String Sentance){
        HashSet<Character> set = new HashSet<>();

         for (int i =0; i<Sentance.length(); i++){

             set.add( Sentance.charAt(i));
         }
         if (set.size()==26){
             return true;
         }else {
             return false;
         }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Sentence = sc.nextLine();

        System.out.println(IsPangram(Sentence));
        sc.close();

    }
}

package String;

import java.util.Scanner;

public class Tolower {

        public static String toLowerCase(String s) {
String result =s.toLowerCase();

         return result;
        }
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("enter your String");
            String s = sc.nextLine();

            System.out.println( toLowerCase(s));
            sc.close();
        }
    }


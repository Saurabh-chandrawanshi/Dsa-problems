package String;

import java.util.Scanner;

public class PrintStringInNextLIne {
    public void print(String s){
       for (int i = 0 ; i<s.length(); i++){
           System.out.println(s.charAt(i));
       }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String dem = sc.nextLine();
        PrintStringInNextLIne obj = new PrintStringInNextLIne();
        obj.print(dem);


    }
}

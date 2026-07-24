package String;

import java.util.Scanner;

public class ReverseString {
    public void reverse(String s){
        String rever1 ="";
        for (int i =s.length()-1 ; i>=0; i--){
            rever1 = rever1+s.charAt(i);

        }
        System.out.println(rever1);
    }
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String ");
        String rever = sc.nextLine();
        ReverseString obj = new ReverseString();
        obj.reverse(rever);
        sc.close();
    }
}

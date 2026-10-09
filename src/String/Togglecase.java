package String;

import java.util.Scanner;

public class Togglecase {

        public String toggleAlphabet(String s){
            String sum = "";
            for (int i = 0 ;i<s.length(); i++){
                int ch = s.charAt(i);
                if(ch>='a'&& ch<='z'){
                    sum = sum + (char) (ch-32);
                }else if(ch>='A'&& ch<='Z'){
                    sum = sum + (char)(ch+32);
                }else{
                    sum= sum +(char)ch;
                }
            }
            return sum;
        }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your String ");
    String sum = sc.nextLine();
    Togglecase obj = new Togglecase();
   String result = obj.toggleAlphabet(sum);
    System.out.println(result);
    sc.close();
}

    }



package String;


import java.util.Scanner;

public class CapitalAndPrintNextLine {
    public static void Capitalnewline(String words) {
       String sum[] = words.split(" ");
       for (int i = 0 ; i<sum.length; i++){
           String result = sum[i];
           System.out.println(Character.toUpperCase(result.charAt(0))+ result.substring(1, result.length()));
       }
    }
    public static void main(String []agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = sc.nextLine();
        Capitalnewline(str);
    }
}

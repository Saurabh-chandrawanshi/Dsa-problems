package String;

import java.util.Scanner;

public class ToupparcaseAllSentance {
    public void prefixCount(String words) {
        String ans = "";
        String []nums = words.split(" ");
           for ( int i =0 ; i<nums.length; i++){
               String sum = nums[i];
               if(sum.length()<=2){
                   ans = ans + sum.toUpperCase();
               }else {
                   ans = ans + Character.toUpperCase(sum.charAt(0))+
                           sum.substring(1,sum.length()-1)+
                           Character.toUpperCase(sum.charAt(sum.length()-1))+" ";
               }
           }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ToupparcaseAllSentance obj = new ToupparcaseAllSentance();
         obj.prefixCount(str);

        sc.close();
    }
}

package String;

import java.util.Scanner;

public class PreFixCount {
    public int prefixCount(String[] words, String pref) {
      int count =0;
      for (String num:words){
           if(num.startsWith(pref)){
               count++;
           }
      }
return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String Length");
        int n = sc.nextInt();

        String []num = new String[n];
        System.out.println("Enter array alement ");
        for (int i =0 ; i<n; i++){
            num[i]=sc.nextLine();
        }
        System.out.println("enter prefix string");
        String pref = sc.nextLine();
        PreFixCount obj = new PreFixCount();
        obj.prefixCount(num,pref);
        sc.close();

    }
}

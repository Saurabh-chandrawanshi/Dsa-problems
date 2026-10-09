package Days_48_30_sept_2026;

import java.util.Scanner;

public class FrequncyCount {
  public  static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int freq[] = new int[128];
       for (int i =0; i<str.length(); i++){
           char ch = str.charAt(i);
           freq[ch] = freq[ch]+1;
       }
       for (int i =0; i<freq.length; i++){
           if(freq[i]>0){
               System.out.println((char) i+" ----"+freq[i]);
           }
       }
    }
}

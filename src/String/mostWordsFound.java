package String;

import java.util.Scanner;

public class mostWordsFound {
    public int mostWordsFoundfun(String[] sentences) {
        int max = 0;

        for (String sentence : sentences) {

            int words = 1;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    words++;
                }
            }

            max = Math.max(max, words);
        }

        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your words");
      String str = sc.nextLine();
      String sum[] = str.split(" ");
      mostWordsFound obj = new mostWordsFound();
      obj.mostWordsFoundfun(sum);
      sc.close();
    }
}

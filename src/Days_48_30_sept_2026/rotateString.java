package Days_48_30_sept_2026;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class rotateString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();
        System.out.println("Enter your goal");
        String goal = sc.nextLine();

        String sum = str+str;

        if (sum.contains(goal)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

package whileloop;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  your number in muliple digit ");
        int n = sc.nextInt();
        String sum="";
        while (n!=0){
            int num = n%10;
          String str = String.valueOf(num);
          sum = sum+num;
            n=n/10;
        }
        System.out.println(Integer.parseInt(sum));
    }
}

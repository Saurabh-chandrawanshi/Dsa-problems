package whileloop;

import java.util.Scanner;

public class seperateddigit {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number in mulipele dgigits = ");
        int n = sc.nextInt();
        String sum ="";

        while (n!=0){
            int dit = n%10;
            sum = sum + dit;

            n = n/10;
        }
        System.out.println(sum);
    }
}

package whileloop;

import java.util.Scanner;

public class checkPlindrome {
    public static void checkPalindromee(int n) {
         int number = n;
        String sum="";
        while (n!=0){
            int num = n%10;
            String str = String.valueOf(num);
            sum = sum+num;
            n=n/10;
        }
        int dum = Integer.parseInt(sum);
        if(dum == number){
            System.out.println("its palindrome");
        }else {
            System.out.println("its not palindrome");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkPlindrome.checkPalindromee(n);
    }
}

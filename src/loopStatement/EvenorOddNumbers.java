package loopStatement;

import java.util.Scanner;

public class EvenorOddNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staring number = ");
        int A = sc.nextInt();
        System.out.println("Enter Ending number = ");
        int n = sc.nextInt();
        int Even = 0;
        int Odd = 0;

        for (int i = A; i<=n; i++){
            if(i%2==0){
                Even+=i;

            }else {
                Odd+=i;

            }

        }
        System.out.println(Even);
        System.out.println(Odd);
    }
}

package AdvanceConditonal;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your amount = ");
        int Amount = sc.nextInt();

        if(Amount>=0 && Amount<=100){
            System.out.printf("%.1f",(Amount*4.2));
        } else if (Amount>=101 && Amount<=200) {
            System.out.printf("%.1f", (100*4.2)+ (Amount-100)*6);
        } else if (Amount>=201 && Amount<=400) {
            System.out.printf("%.1f",(100*4.2)+(100*6)+(Amount-200)*8);
        } else if(Amount>=401 ) {
            System.out.printf("%.1f",(100*4.2)+(100*6)+ (200*8)+(Amount-400)*13);
        }else {
            System.out.println("invalid");
        }

    }
}

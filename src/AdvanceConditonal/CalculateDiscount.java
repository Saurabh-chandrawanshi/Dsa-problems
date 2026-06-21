package AdvanceConditonal;

import java.util.Scanner;

public class CalculateDiscount {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Amount = ");
        int Amount = sc.nextInt();

        if(Amount>0 && Amount<5000){
            System.out.println(Amount);
        }else if(Amount>5001 && Amount<7000){
            System.out.println(Amount-(Amount*5)/100);
        }else if(Amount>7001 && Amount<9001){
            System.out.println(Amount-(Amount*10)/100);
        }else if(Amount>9000){
            System.out.println(Amount-(Amount*20)/100);
        }else {
            System.out.println("Invalid");
        }
    }
}

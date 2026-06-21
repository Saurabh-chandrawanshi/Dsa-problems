package conditionalStatement;

import java.util.Scanner;

public class compondintrest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal of Amount p =");
        double P = sc.nextDouble();
        System.out.println("Enter r");
        double r = sc.nextDouble();
        System.out.println("Enter t");
        double t = sc.nextDouble();
        System.out.println("Enter n");
        double n = sc.nextDouble();


        double A =(P*Math.pow((1+r/n),(n*t)));

        double CI = A-P;
        System.out.println("compound intrest is = "+CI);
    }
}

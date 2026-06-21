package conditionalStatement;

import java.util.Scanner;

public class agecheker {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name = ");
        String name =  sc.next();
        System.out.println("Enter your age = ");
        int age = sc.nextInt();

        if(age <= 0 && age >= 150){
            System.out.println(" Enter valid Details please");
        }else if(age >= 18  ){
            System.out.println(name+" is a valid voter");
        }else {
            System.out.println(name+" is not a valid voter");
            System.out.println(name+" will be eligible in "+ (18-age) +" years");
        }
    }
}

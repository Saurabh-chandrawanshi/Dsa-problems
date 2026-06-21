package AdvanceConditonal;

import java.util.Scanner;

public class salarycheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Gender = ");
        char gender = sc.next().charAt(0);
        System.out.println("Enter year = ");
        int year = sc.nextInt();
        System.out.println("Enter qualification = ");
        char qulification = sc.next().charAt(0);

        if((gender == 'm' || gender == 'M') &&(qulification=='p'|| qulification=='P') &&(year>=10) ){
            System.out.println("15000");
        }else if ((gender == 'm' || gender=='M')&&(qulification =='p'|| qulification=='P')&&(year<10)){

                System.out.println("10000");
        }else if ((gender == 'm' || gender=='M')&&(qulification =='u'||qulification=='U')&&(year>=10)){

            System.out.println("10000");
        }else if ((gender == 'm' || gender=='M')&&(qulification =='u'||qulification=='U')&&(year<10)){

            System.out.println("7000");
        }else if ((gender == 'F' || gender=='f')&&(qulification =='p'|| qulification=='P')&&(year>=10)){

            System.out.println("12000");
        }else if ((gender == 'F'||  gender=='f')&&(qulification =='u'|| qulification=='U')&&(year>=10)){

            System.out.println("9000");
        }else if ((gender == 'F' || gender=='f')&&(qulification =='p'|| qulification=='P')&&(year<10)){

            System.out.println("10000");
        }else if ((gender == 'F' || gender=='f')&&(qulification =='u'|| qulification=='U')&&(year<10)){

            System.out.println("6000");
        }
        else {
            System.out.println("Invalid input");
        }

    }

}

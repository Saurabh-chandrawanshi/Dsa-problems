package Switchstatement;

import java.util.Scanner;

public class arearectangletriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter circle for c");
        System.out.println("enter rectengle for r ");
        System.out.println("enter triangel for t");
        char area= sc.next().charAt(0);
        switch (area){
            case 'c':
                System.out.println("Enter r = ");
                int r = sc.nextInt();
                System.out.println((3.15)*r*r);//pi *r *r
                break;
            case 'r':
                System.out.println("Enter length ");
                int l = sc.nextInt();
                System.out.println("Enter width ");
                int w = sc.nextInt();
                System.out.println(l*w);//l*w
                break;
            case 't':
                System.out.println("enter base");
                int b = sc.nextInt();
                System.out.println("enter height ");
                int h = sc.nextInt();
                System.out.println((1/2)*b*h);
                break;
            default:
                System.out.println("enter valid input");

        }
        sc.close();
    }
}

package DesignConcept;

import java.util.Scanner;

public class CabService {
    String car_type;
    double km;
    double bill;

    public CabService(){
         this.car_type = " ";
         this.km =this.bill =0.0;
    }
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Car Type (AC or Non AC)");
        this.car_type = sc.nextLine();
        System.out.println("Enter km ");
        this.km=sc.nextDouble();
    }
    public void calculate() {
        if(this.car_type.equals("AC")){
            if(this.km <=5) this.bill = 150.0;

            else this.bill=150+(this.km-5)*10;
        } else if (this.car_type.equals("Non AC")) {
            if (this.km<=5) this.bill = 120.0;

            else this.bill = 120+(this.km-5)*8;

        }else{
            System.out.println("UnAvaliable input");
        }
    }

    public void display() {
        System.out.println("car_type is : "+car_type);
        System.out.println("Km is : "+km);
        System.out.println("Bill is : "+bill);
    }
    public static void main(String[] args){
        CabService obj = new CabService();

        obj.accept();
        obj.calculate();
        obj.display();

    }

}

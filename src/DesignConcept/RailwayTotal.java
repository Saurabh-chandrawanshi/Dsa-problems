package DesignConcept;

import java.util.Scanner;

public class RailwayTotal {
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;
   public RailwayTotal(){
       this.name ="";
       this.coach ="";
       this.mobno=0;
       this.amt =0;
       this.totalamt=0;

   }
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter passenger name ");
        this.name = sc.nextLine();
        System.out.println("Enter coach name (First_AC/Scond_AC/Third_AC/Sleeper)");
        this.coach = sc.nextLine();
        System.out.println("enter Mobile number ");
        this.mobno = sc.nextLong();

        System.out.println("enter Amount ");
        this.amt = sc.nextInt();
    }
    public void update() {
       if (this.coach.equals("First_AC"))this.totalamt = 700 + this.amt;

        else if (this.coach.equals("Second_AC")) this.totalamt = 500 + this.amt;

       else if(this.coach.equals("Third_AC")) this.totalamt = 250 + this.amt;

        else if (this.coach.equals("Sleeper"))this.totalamt = this.amt;

        else System.out.println("Invalid Input");


    }

    public void display() {
        System.out.println("NAME: "+name);
        System.out.println("COACH: "+coach);
        System.out.println("MOBILE NUMBER: "+mobno);
        System.out.println("TOTAL AMOUNT: "+totalamt);

    }
    public  static void main(String []args){
       RailwayTotal obj = new RailwayTotal();
       obj.accept();
       obj.update();
       obj.display();
    }
}

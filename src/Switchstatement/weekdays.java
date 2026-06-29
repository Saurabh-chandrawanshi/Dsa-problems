package Switchstatement;

import javax.xml.transform.Source;
import java.util.Scanner;

public class weekdays {
    public String getDay(int n) {
      String str = "Invalid Number";
      if (n<=7&&n>0){


      switch (n){
          case 1:
          str= "Monday";
          break;
          case 2:
              str= "Tuesday";
              break;
              case 3:
              str= "Wednesday";
              break;
          case 4:
              str= "Thursday";
              break;
          case 5:
              str= "Friday";
              break;
          case 6:
              str= "Saturday";
              break;
          case 7:
              str= "Sunday";
              break;
          default:
      }
     return str;
    }else{
          return "invalid day";
      }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n =  sc.nextInt();
        weekdays obj = new weekdays();
      String ss =  obj.getDay(n);
        System.out.println(ss);
        sc.close();
    }
}

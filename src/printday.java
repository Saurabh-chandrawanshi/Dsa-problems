import java.util.Scanner;

public class printday {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente your day number");
        int A = sc.nextInt();
        if(A==1){
            System.out.println("monday");
        } else if (A==2) {
            System.out.println("Tuesday");
        }else if (A==3) {
            System.out.println("Wednesday");
        }else if (A==4) {
            System.out.println("Thursday");
        }else if (A==5) {
            System.out.println("Friday");
        }else if (A==6) {
            System.out.println("Saturday");
        }else if (A==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid number");
        }
    }
}

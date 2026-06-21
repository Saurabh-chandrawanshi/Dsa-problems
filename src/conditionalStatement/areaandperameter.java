package conditionalStatement;

import java.util.Scanner;

public class areaandperameter {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("width = ");
        int W= sc.nextInt();
        System.out.println("length = ");
        int L = sc.nextInt();

        int area = L*W;
        System.out.println(area);
        int perameter = 2 *(L+W);
        System.out.println(perameter);

    }
}

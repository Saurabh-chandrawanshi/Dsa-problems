package new_practice_dsa.Day_1_Array;

import java.util.Scanner;

public class BuyAndShell {
    public static int maxProFit(int[] prices) {
        int maxProfitt = 0 ;
        for (int i =0; i<prices.length; i++){
            for (int j = i+1; j<prices.length; j++){
                int profit = prices[j] - prices[i];
                if (profit < maxProfitt){
                    maxProfitt = profit;
                }
            }
        }
    return maxProfitt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array length");
        int limit = sc.nextInt();
        System.out.println("enter Array Element ");
        int [] price = new int[limit];
        for (int i = 0 ; i< price.length; i++){
            price[i]= sc.nextInt();
        }



        System.out.println(  maxProFit(price));
    }
}

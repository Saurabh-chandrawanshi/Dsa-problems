package Days_48_3_oct_2026;

import java.util.ArrayList;
import java.util.Scanner;

public class ishappy {

        public static boolean isHappy(int n) {
            ArrayList<Integer> num = new ArrayList<>();

            while (true){
                int sum = 0;
                while (n>0){
                    int dig = n% 10;
                    sum += dig*dig;
                    n= n/10;
                }
                if (sum==1){return true;}
                if (num.contains(sum)){return false;}
                else {
                    num.add(sum);
                    n=sum;
                }
            }

        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(isHappy(n));
        }
    }


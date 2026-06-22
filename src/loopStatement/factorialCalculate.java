package loopStatement;

public class factorialCalculate {
    public  static void factorial(int n){
        long fact =1;
        for (int i = n ; i>=1; i--){
             fact *= i ;
        }
        System.out.println(fact);
    }
    public static void main(String [] args){
       factorialCalculate.factorial(5);
    }
}

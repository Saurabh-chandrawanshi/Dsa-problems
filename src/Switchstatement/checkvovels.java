package Switchstatement;

import java.util.Scanner;

public class checkvovels {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your letter ");
        char n = sc.next().charAt(0);
            if ((n>='a'&& n <='z')||(n>='A'&&n<='Z')){
        switch (n){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default :
                System.out.println("Consonant");
        }}else{
    System.out.println("Not a letter");
        }
sc.close();
    }
}

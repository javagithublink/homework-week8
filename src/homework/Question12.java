package homework;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 */
public class Question12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = input.nextInt();
        input.close();
        boolean b = false;

        for (int i = 2; i <=a/2;i++){
            if (a%i==0){
                b = true;
                break;
            }
        }
        if(b!=true){
            System.out.println(a+ " is a prime number");
        }else{
            System.out.println(a+ " is not a prime number");
        }

    }


}

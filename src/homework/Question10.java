package homework;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */
public class Question10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a= input.nextInt();
        input.close();
        int number, b, total = 0;

        number = a;
        while (number !=0){
            b = number %10;
            total = total+b*b*b;
            number /= 10;
        }

        if(total == a){
            System.out.println(a + " is an Armstrong number");
        }else{
            System.out.println(a+" is not an Armstrong number");
        }

    }

}

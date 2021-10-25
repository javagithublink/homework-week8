package homework;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Question9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter required length of Fibonacci Series : ");
        int a = input.nextInt()-1;
        input.close();

        int num1 = 0, num2=1, num3;
        System.out.print(num2+" ");
        for (int i=0; i<a;i++){

            num3 = num1+num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;

        }
    }

}

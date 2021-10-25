package homework;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 */
public class Question6 {

    public static void main(String[] args) {


        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        a = input.nextInt();
        input.close();

        for (b=1; b<=a;b++){

            for (c=1;c<=b;c++){
                System.out.print(c);
            }
            System.out.println();
        }


    }
}

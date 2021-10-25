package homework;
/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        int min=0;
        int max =0;
        boolean a = false;
        boolean b = false;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number: ");
            if (input.hasNextInt()) {
                int c = input.nextInt();
                if (c > max || !a) {
                    max = c;
                    a = true;
                }
                if (c < min || !b) {
                    min = c;
                    b = true;
                }
            } else {
                System.out.println("Minimum Number = " + min);
                System.out.println("Maximum Number = " + max);
                break;
            }
        }
        input.close();
    }


    }



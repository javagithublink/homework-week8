package homework;
/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;

public class Question1 {


    public static void hasNextInt() {

        Scanner input1 = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.print("Enter number : ");
            if (input1.hasNextInt()) {
                input1.nextInt();
            } else {

                System.out.println("Invalid number");
            }
            i++;

        }
        input1.close();
    }

    public static void nextInt() {

        Scanner input2 = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        int i = 1;


        while (i <= 10) {
            System.out.print("Enter number #"+i+": ");
            num = input2.nextInt();
            sum = sum+num;
            i++;
        }
        System.out.println("The total sum is : "+sum);

    }

    public static void main(String[] args) {


    nextInt();

    }

}




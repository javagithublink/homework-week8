package homework;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */
public class Question3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input an alphabet : ");
        String a = input.nextLine();
        input.close();
        int i=1;

        if (a.length()==1)
        switch (a.toUpperCase()){
            case "a":
                System.out.println(a+ " is vowels");
                break;
            case "e":
                System.out.println(a+ " is vowels");
                break;
            case "i":
                System.out.println(a+ " is vowels");
                break;
            case "o":
                System.out.println(a+ " is vowels");
                break;
            case "u":
                System.out.println(a+ " is vowels");
                break;
            default:
                if(Pattern.matches ("[a-zA-Z]",a))
                System.out.println(a+ " is consonant");
                else{
                    System.out.println("Error :  enter correct details");
                }
        }
        else {
            System.out.println("Error :  enter correct details");
        }

    }


}

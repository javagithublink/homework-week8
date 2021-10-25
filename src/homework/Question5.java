package homework;

/**
 *5. Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */
public class Question5 {

    public static boolean isPalindrom(int number){

        int lastDigit=0, reverse=0, num = Math.abs(number);

        int temp = num;


                while (num > 0) {
                    lastDigit = num % 10;
                    reverse = (reverse * 10) + lastDigit;
                    num = num / 10;
                }


        if (temp==reverse){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Is this Palindrome Number? : "+isPalindrom(-1221));
        System.out.println("Is this Palindrome Number? : "+isPalindrom(707));
        System.out.println("Is this Palindrome Number? : "+isPalindrom(11212));
    }
}

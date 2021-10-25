package homework;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */
public class Question13 {

    public static boolean hasSharedDigit(int a, int b){

        boolean c = false;
        int lefta = a/10;
        int righta = a%10;
        int leftb = b/10;
        int rightb = b%10;
        if (a<10 || a>99 || b<10 || b>99){
            c= false;
        } else if (lefta == leftb || lefta == rightb || righta == leftb || righta == rightb){
            c = true;
        }
        return c;
    }

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

}

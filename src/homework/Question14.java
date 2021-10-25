package homework;

/**
 * Write a program in Java to display the pattern like a diamond.
 */
public class Question14 {

    public static void main(String[] args) {

        int n = 7;
        int i=1;
        int j;
        while (i<=n){
            j=1;
            while (j++<=n-i){
                System.out.print(" ");
            }
        j=1;
            while (j++<=i*2-1){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    i=n-1;
        while(i>0){
            j=1;
            while(j++<=n-i){
                System.out.print(" ");
            }
        j=1;
            while(j++<=i*2-1){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}
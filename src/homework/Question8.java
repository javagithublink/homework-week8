package homework;

/**
 * Display right angle triangle of @ using nested for loops
 */
public class Question8 {

    public static void main(String[] args) {

        int a, b, c;

        for(a=0;a<=5;a++){

            for(b=0;b<=a;b++){

                System.out.print("@");
            }
            System.out.println();
        }

    }
}

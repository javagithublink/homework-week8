package homework;

public class Question11 {

    public static int getEvenDigitSum(int number){

        if(number<0){
            return -1;
        }
        int a=0;
        while(number>0){
            if((number%10)%2==0){
                a+=number%10;
            }
            number = number/10;
        }
        return a;

    }

    public static void main(String[] args) {

        System.out.println("sum "+getEvenDigitSum(123456789));
        System.out.println("sum "+getEvenDigitSum(252));
        System.out.println("sum "+getEvenDigitSum(-22));
    }
}


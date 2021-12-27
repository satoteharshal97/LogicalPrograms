
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        sc.close();
        checkPerfectNumber(number);
    }
    static void checkPerfectNumber(int number){
        int temp = number;
        int valueOfSum = 0;
        int i;
        for(i = 1 ; i < number ; i++) {
            if(number % i == 0)  {
                valueOfSum = valueOfSum + i;
            }
        }
        if (valueOfSum == temp) {
            System.out.format(number + " is a perfect number");
        }
        else {
            System.out.format(number + " is not a perfect number");
        }
    }
}

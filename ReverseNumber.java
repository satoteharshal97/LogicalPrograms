
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            reverseNumber(number);
    }
    static void reverseNumber(int number){
        if(number <= 0){
            System.out.println("Please Positive Number: ");
        }
        else{
            int sumOfNumber = 0, temp = number, remainder;

            while (temp != 0) {
                remainder = temp % 10;
                sumOfNumber = sumOfNumber * 10 + remainder;
                temp = temp / 10;
            }
            System.out.println("Reverse of " + number +" is " + sumOfNumber);
        }
    }
}

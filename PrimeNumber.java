import java.util.Scanner;

public class PrimeNumber {

    static void getPrime(int number) {

        boolean flag = false;
        for (int i = 2; i <= number / 2; i++) {
            int result = number % i;
            if (result == 0) {
                flag = true;
                break;
            }
        }
        if (flag != true) {
            System.out.println(number + " is  a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        getPrime(number);
    }

}
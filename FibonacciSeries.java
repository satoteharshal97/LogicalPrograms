import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count for Fibonaci Series: ");
        int seriesCount = sc.nextInt();
        fibonaciSeries(seriesCount);
    }
        static void fibonaciSeries(int seriesCount) {

            int firstNumber = 0;
            int secondNumber = 1;

            System.out.println("Fibonaci Series is upto: " + seriesCount);
            //Print the fibonacci series
            for (int i = 1; i <= seriesCount; ++i) {
                System.out.print(firstNumber + " ");
                int sumOfNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sumOfNumber;
            }
        }
    }

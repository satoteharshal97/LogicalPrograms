
public class CouponNumbers {
    public static final int FIRST_COUPON_NUMBER = 456;
    public static final int SECOND_COUPON_NUMBER = 33;
    public static final int THIRD_COUPON_NUMBER = 327;

    public static void main(String[] args) {
        generateRandomNumber1();
        generateRandomNumber2();
        generateRandomNumber3();
    }
    static void generateRandomNumber1() {
        int randomNumber = 1;
        int count = 0;
        boolean flag = false;
        while (randomNumber > 0) {
            count++;
            randomNumber = (int) Math.floor(Math.random() * (FIRST_COUPON_NUMBER + 1)) + 1;
            if (randomNumber == FIRST_COUPON_NUMBER) {
                flag = true;
                break;
            }
        }
        if(flag == true) {
            System.out.println("Yay!You got first the coupon number");
            System.out.println("Number of iteration to find first coupon number: " + count);
        }
        System.out.println();
    }static void generateRandomNumber2() {
        int randomNumber = 1;
        int count = 0;
        boolean flag = false;
        while (randomNumber > 0) {
            count++;
            randomNumber = (int) Math.floor(Math.random() * (SECOND_COUPON_NUMBER + 1)) + 1;
            if (randomNumber == SECOND_COUPON_NUMBER) {
                flag = true;
                break;
            }
        }
        if(flag == true) {
            System.out.println("Yay!You got second the coupon number");
            System.out.println("Number of iteration to find second coupon number: " + count);
        }
        System.out.println();
    }static void generateRandomNumber3() {
        int randomNumber = 1;
        int count = 0;
        boolean flag = false;
        while (randomNumber > 0) {
            count++;
            randomNumber = (int) Math.floor(Math.random() * (THIRD_COUPON_NUMBER + 1)) + 1;
            if (randomNumber == THIRD_COUPON_NUMBER) {
                flag = true;
                break;
            }
        }
        if(flag == true) {
            System.out.println("Yay!You got third the coupon number");
            System.out.println("Number of iteration to find third coupon number: " + count);
        }
    }
}

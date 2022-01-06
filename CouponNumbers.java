
public class CouponNumbers {
    public static final int FIRST_COUPON_NUMBER = 456;
    public static final int SECOND_COUPON_NUMBER = 33;
    public static final int THIRD_COUPON_NUMBER = 327;

    public static void main(String[] args) {
        generateRandomNumber(FIRST_COUPON_NUMBER);
        generateRandomNumber(SECOND_COUPON_NUMBER);
        generateRandomNumber(THIRD_COUPON_NUMBER);
    }
    static void generateRandomNumber(int FIRST_COUPON_NUMBER) {
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
            System.out.println("Yay!You got the coupon number");
            System.out.println("Number of iteration to find first coupon number: " + count);
        }
        System.out.println();
    }
}

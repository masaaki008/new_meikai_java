package Screen02Pra;

import java.util.Random;

public class En2no7 {
    public static void main(String[] args) {
        Random rand = new Random();

        int plus_num = rand.nextInt(9) + 1;
        int minus_num = -(rand.nextInt(9) + 1);
        int plus_num_two = rand.nextInt(90) + 10;

        System.out.println("一桁の正の整数値(1 <= x <= 9):" + plus_num);
        System.out.println("一桁の負の整数値(-9 <= x <= -1):" + minus_num);
        System.out.println("二桁の正の整数値(10 <= x <= 99):" + plus_num_two);
    }
}

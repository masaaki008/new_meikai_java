package Screen02Pra;

import java.util.Random;

public class En2no9 {
    public static void main(String[] args) {
        Random rand = new Random();

        double num_a = rand.nextDouble();
        double num_b = rand.nextDouble() + rand.nextInt(10);
        double num_c = rand.nextDouble() - rand.nextDouble();

        System.out.println("0.0 <= x < 1.0 -> " + num_a);
        System.out.println("0.0 <= x < 10.0 -> " + num_b);
        System.out.println("-1.0 <= x < 1.0 -> " + num_c);
    }
}

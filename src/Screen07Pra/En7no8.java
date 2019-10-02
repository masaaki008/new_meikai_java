package Screen07Pra;

import java.util.Random;

public class En7no8 {
    static int random(int a, int b) {
        Random rand = new Random();
        if (a > b)
            return a;
        else
            return a + rand.nextInt(b - a);
    }

    public static void main(String[] args) {
        int a = random(5, 10);
        int b = random(10, 5);
        int c = random(10, 20);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

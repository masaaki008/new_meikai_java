package Screen07Pra;

import java.util.Random;
import java.util.Scanner;

public class En7no10 {
    static Scanner stdIn = new Scanner(System.in);

    static boolean confirmRetry() {
        int cont;
        do {
            System.out.print("もう一度?<Yes.1/No.0>:");
            cont = stdIn.nextInt();
        } while (cont != 0 && cont != 1);
        return cont == 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("暗算力トレーニング");
        do {
            int x = rand.nextInt(900) + 100;
            int y = rand.nextInt(900) + 100;
            int z = rand.nextInt(900) + 100;
            int random_q = rand.nextInt(4);
            int ans = 0;
            String s = "";

            switch (random_q) {
                case 0: {
                    s = x + " + " + y + " + " + z + " = ";
                    ans = x + y + z;
                    break;
                }
                case 1: {
                    s = x + " + " + y + " - " + z + " = ";
                    ans = x + y - z;
                    break;
                }
                case 2: {
                    s = x + " - " + y + " + " + z + " = ";
                    ans = x - y + z;
                    break;
                }
                case 3: {
                    s = x + " - " + y + " - " + z + " = ";
                    ans = x - y - z;
                    break;
                }
            }

            while (true) {
                System.out.print(s);
                int k = stdIn.nextInt();
                if (k == ans)
                    break;
                System.out.println("違いますよ");
            }
        } while (confirmRetry());
    }
}

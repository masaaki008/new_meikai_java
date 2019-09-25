package Screen03Pra;

import java.util.Random;

public class En3no17 {
    public static void main(String[] args) {
        // 0～2の乱数を生成しそれに応じたじゃんけんの手を表示
        Random rand = new Random();

        int hand = rand.nextInt(3);

        switch (hand) {
            case 0: System.out.println("グー"); break;
            case 1: System.out.println("チョキ"); break;
            case 2: System.out.println("パー"); break;
        }
    }
}

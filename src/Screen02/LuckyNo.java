package Screen02;

// Randomモジュールのインポート
import java.util.Random;

public class LuckyNo {
    public static void main(String[] args) {
        // 0～9のラッキーナンバーを乱数で生成して表示

        // Randomインスタンスの生成
        Random rand = new Random();

        // 0～9の乱数を生成
        int lucky =rand.nextInt(10);

        System.out.println("Lucky number is " + lucky);
    }
}

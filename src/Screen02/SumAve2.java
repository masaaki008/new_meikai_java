package Screen02;

public class SumAve2 {
    public static void main(String[] args) {
        int x;
        int y;

        // 変数に値がないとコンパイルエラー
        x = 63;
        y = 18;

        System.out.println("xの値は" + x);
        System.out.println("yの値は" + y);
        System.out.println("合計は" + (x + y));
        System.out.println("平均は" + ((x + y) / 2));
    }
}

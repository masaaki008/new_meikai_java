package Screen02;

public class SumAve3 {
    public static void main(String[] args) {

        /*
         *  初期化と代入の違い
         *  初期化: 変数を生成するときに値を入れること
         *  代入: 生成ずみの変数に値を入れること
         */

        // 変数宣言時に初期化子を与えるパターン
        // 1行で表す場合
        // int x = 63, y = 18;
        int x = 63;
        int y = 18;

        System.out.println("xの値は" + x);
        System.out.println("yの値は" + y);
        System.out.println("合計は" + (x + y));
        System.out.println("平均は" + ((x + y) / 2));
    }
}

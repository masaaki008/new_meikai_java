package Screen07;

// List7C-2
// 実引数の評価順序を確認
public class Argument {
    static void method(int x, int y, int z) {
        System.out.println("x = " + x + " y = " + y + " z = " + z);
    }

    public static void main(String[] args) {
        int i = 0;

        // 左から順に値が渡される
        method(i, i = 5, ++i);
    }
}

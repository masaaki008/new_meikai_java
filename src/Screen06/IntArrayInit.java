package Screen06;

// List6-6
public class IntArrayInit {
    public static void main(String[] args) {
        // 配列の各要素を1, 2, 3, 4, 5で初期化して表示
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}

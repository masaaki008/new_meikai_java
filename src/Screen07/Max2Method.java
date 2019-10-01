package Screen07;

// List7-4
// a, bの最大値を返却
public class Max2Method {
    static int max2(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("最大値は" + max2(1, 5));
    }
}

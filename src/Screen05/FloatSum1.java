package Screen05;

// List5-9
public class FloatSum1 {
    public static void main(String[] args) {
        // 0.0から1.0まで0.001単位で増やして合計を表示(繰り返しをfloatで制御)
        float sum = 0.0F;

        for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
            System.out.println("x = " + x);
            sum += x;
        }
        System.out.println("sum = " + sum);
    }
}

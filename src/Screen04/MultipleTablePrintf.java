package Screen04;

// List4-22
public class MultipleTablePrintf {
    public static void main(String[] args) {
        // 99の表を表示
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();
        }
    }
}

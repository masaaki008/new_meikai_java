package Screen07;

// List7C-1
public class FinalParameter {
    static int sumOf(final int x, final int y, final int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        System.out.println(sumOf(1, 2, 3));
    }
}

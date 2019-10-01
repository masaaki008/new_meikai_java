package Screen07Pra;

public class En7no7 {
    static void putStars(int n) {
        putChars('*', n);
    }

    static void putChars(char c, int n) {
        while (n-- > 0)
            System.out.print(c);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            putStars(i);
            System.out.println();
        }
    }
}

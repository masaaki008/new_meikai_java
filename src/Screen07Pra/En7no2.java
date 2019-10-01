package Screen07Pra;

public class En7no2 {
    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 3, 5) == 1);
        System.out.println(min(3, 7, 2) == 2);
        System.out.println(min(5, 1, 4) == 1);
    }
}

package Screen07Pra;

public class En7no3 {
    static int med(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println(med(1, 3, 5) == 3);
        System.out.println(med(2, 6, 1) == 2);
        System.out.println(med(3, 3, 1) == 3);
    }
}

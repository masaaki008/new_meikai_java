package Screen07;

// List7no6
public class Power2 {
    static double power(double x, int n) {
        double tmp = 1.0;

        while (n-- > 0)
            tmp *= x;
        return tmp;
    }

    public static void main(String[] args) {
        double x = 5.5;
        int n = 3;

        System.out.println(power(x, n));
        System.out.println(n);
    }
}

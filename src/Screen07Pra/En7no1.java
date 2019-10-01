package Screen07Pra;

public class En7no1 {
    static int signOf(int n) {
        if (n > 0)
            return 1;
        else if (n < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = -5;
        int n3 = 0;

        System.out.println("n1:" + signOf(n1));
        System.out.println("n2:" + signOf(n2));
        System.out.println("n3:" + signOf(n3));
    }
}

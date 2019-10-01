package Screen07Pra;

public class En7no4 {
    static int sumUp(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumUp(1));
        System.out.println(sumUp(2));
        System.out.println(sumUp(3));
        System.out.println(sumUp(4));
        System.out.println(sumUp(5));
        System.out.println(sumUp(6));
        System.out.println(sumUp(7));
    }
}

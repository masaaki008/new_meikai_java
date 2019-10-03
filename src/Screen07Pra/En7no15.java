package Screen07Pra;

public class En7no15 {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i : a)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(sumOf(a));
    }
}

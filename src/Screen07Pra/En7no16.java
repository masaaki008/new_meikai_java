package Screen07Pra;

public class En7no16 {
    static int minOf(int[] a) {
        int min = a[0];
        for (int i : a)
            if (i < min)
                min = i;
        return min;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 3, 9, 6};
        System.out.println(minOf(a));
    }
}

package Screen06;

// List6-12
public class AssignArray {
    public static void main(String[] args) {
        // 配列の代入(間違い)
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 5, 4, 3, 2, 1};

        System.out.print("a = ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        System.out.print("b = ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        b = a;

        a[0] = 10;

        System.out.println("aをbに代入しました");
        System.out.print("a = ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        System.out.print("b = ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();
    }
}

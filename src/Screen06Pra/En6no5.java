package Screen06Pra;

import java.util.Scanner;

public class En6no5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:"); int n = stdIn.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("a = {");
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1)
                System.out.print(a[i] + ", ");
            else
                System.out.print(a[i]);
        }
        System.out.println("}");
    }
}

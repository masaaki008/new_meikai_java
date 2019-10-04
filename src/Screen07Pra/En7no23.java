package Screen07Pra;

import java.util.Scanner;

public class En7no23 {
    static int[] arraySrchIdx(int[] a, int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == x)
                count += 1;

        int[] carr = new int[count--];
        for (int i = a.length - 1; count >= 0; i--)
            if (a[i] == x)
                carr[count--] = i;

        return carr;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("探索したい値:");
        int idx = stdIn.nextInt();

        int[] b = arraySrchIdx(a, idx);
        if (b.length == 0)
            System.out.println("一致する要素はありません");
        else {
            System.out.println("一致する要素のインデックス");
            for (int i = 0; i < b.length; i++)
                System.out.println(b[i]);
        }
    }
}

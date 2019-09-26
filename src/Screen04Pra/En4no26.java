package Screen04Pra;

import java.util.Scanner;

public class En4no26 {
    public static void main(String[] args) {
        // 読み込んだ整数を加算(負の値は加算しない)
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数を加算します");
        System.out.print("何個加算しますか:");
        int n = stdIn.nextInt();

        int count = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("整数:");
            double t = stdIn.nextDouble();
            if (t < 0) {
                System.out.println("負の値は加算しません");
                continue;
            }
            count += 1;
            sum += t;
        }
        System.out.println("合計は" + sum + " 平均は" + (sum / count));
    }
}

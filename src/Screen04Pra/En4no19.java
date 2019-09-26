package Screen04Pra;

import java.util.Scanner;

public class En4no19 {
    public static void main(String[] args) {
        // 入力された月の季節を表示
        Scanner stdIn = new Scanner(System.in);

        int month;
        int retry;
        do {
            do {
                System.out.print("季節を求めます\n何月ですか:");
                month = stdIn.nextInt();
            } while (month > 12 || month < 1);

            if (month >= 3 && month <= 5)
                System.out.println("春");
            else if (month >= 6 && month <= 8)
                System.out.println("夏");
            else if (month >= 9 && month <= 11)
                System.out.println("秋");
            else if (month == 12 || month == 1 || month == 2)
                System.out.println("冬");

            System.out.print("もう一度?1.Yes/0.No:");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}

package Screen06Pra;

import java.util.Random;
import java.util.Scanner;

public class En6no15 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] weekString = {
                "monday", "tuesday", "wednesday", "thursday",
                "friday", "saturday", "sunday"
        };
        String[] weekString_ja = {
                "月曜日", "火曜日", "水曜日", "木曜日",
                "金曜日", "土曜日", "日曜日"
        };

        int week_num_after = 0;
        int retry = 1;
        do {
            int week_num = rand.nextInt(7);
            if (week_num == week_num_after) week_num = rand.nextInt(7);

            while (true) {
                System.out.print(weekString_ja[week_num] + ":");
                String week_ans = stdIn.next();

                if (week_ans.equals(weekString[week_num])) {
                    System.out.println("正解です");
                    break;
                } else {
                    System.out.println("違います");
                }
            }

            System.out.print("もう一度?1.Yes/0.No:");
            retry = stdIn.nextInt();
            week_num_after = week_num;
        } while (retry == 1);
    }
}

package day1;

import java.util.Scanner;

public class DayArray {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

        System.out.print("日付は何個:");
        int n = stdIn.nextInt();

        Day[] a = new Day[n];

        // エラー
        //for (int i = 0; i < a.length; i++)
        //    a[i].set(2017, 10, 15);

        // ちゃんと動く
        for (int i = 0; i < a.length; i++)
            a[i] = new Day(2017, 10, 15);

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i].getYear() + "年" +
                    a[i].getMonth() + "月" + a[i].getDate() + "日(" + wd[a[i].dayOfWeek()] + ")");
    }
}

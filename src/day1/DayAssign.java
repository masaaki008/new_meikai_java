package day1;

import java.util.Scanner;

public class DayAssign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

        System.out.println("誕生日を西暦で入力せよ");
        System.out.print("年:"); int y = stdIn.nextInt();
        System.out.print("月:"); int m = stdIn.nextInt();
        System.out.print("日:"); int d = stdIn.nextInt();

        Day birthday = new Day(y, m, d);
        System.out.printf("あなたの誕生日は%s年%s月%s日%s曜日です\n", birthday.getYear(), birthday.getMonth(), birthday.getDate()
        , wd[birthday.dayOfWeek()]);


        Day xDay = birthday;
        xDay.set(2100, 12, 31);
        System.out.printf("birthday = %s年%s月%s日(%s)\n", birthday.getYear(), birthday.getMonth(), birthday.getDate(), wd[birthday.dayOfWeek()]);
        System.out.printf("xDay = %s年%s月%s日(%s)\n", xDay.getYear(), xDay.getMonth(), xDay.getDate(), wd[xDay.dayOfWeek()]);
    }
}

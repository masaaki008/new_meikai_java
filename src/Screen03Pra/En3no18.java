package Screen03Pra;

import java.util.Scanner;

public class En3no18 {
    public static void main(String[] args) {
        // 月を1～12の整数値として読み込んで季節を表示
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何月:");
        int month = stdIn.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5: System.out.println("春"); break;

            case 6:
            case 7:
            case 8: System.out.println("夏"); break;

            case 9:
            case 10:
            case 11: System.out.println("秋"); break;

            case 12:
            case 1:
            case 2: System.out.println("冬"); break;
        }
    }
}

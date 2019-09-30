package Screen06Pra;

import java.util.Random;
import java.util.Scanner;

public class En6no14 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] monthString = {
                "January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October",
                "November", "December"
        };

        int after_month = 0;
        int retry = 1;
        do {
            int month = rand.nextInt(12);
            if (month == after_month) month =rand.nextInt(12);

            while (true) {
                System.out.print((month + 1) + "月:");
                String ans = stdIn.next();

                if (ans.equals(monthString[month])) {
                    System.out.println("正解です");
                    break;
                } else {
                    System.out.println("違います");
                }
            }

            System.out.print("もう一度?1.Yes/0.No:");
            retry = stdIn.nextInt();
            after_month = month;
        } while (retry == 1);
    }
}

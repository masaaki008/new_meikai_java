package Screen04Pra;

import java.util.Scanner;

public class En4no15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何cmから:"); int before_cm = stdIn.nextInt();
        System.out.print("何cmまで:"); int after_cm = stdIn.nextInt();
        System.out.print("何cmごと"); int term_cm = stdIn.nextInt();

        System.out.println("身長　　標準体重");
        for (int i = before_cm; i <= after_cm; i += term_cm) {
            System.out.println(i + "　　" + ((i - 100) * 0.9));
        }
    }
}

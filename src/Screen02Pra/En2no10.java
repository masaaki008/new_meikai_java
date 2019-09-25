package Screen02Pra;

import java.util.Scanner;

public class En2no10 {
    public static void main(String[] args) {
        // 姓名を別々に入力し結合して表示する
        Scanner stdIn = new Scanner(System.in);

        System.out.print("姓:");
        String n = stdIn.next();

        System.out.print("名:");
        String m = stdIn.next();

        System.out.println("こんにちは" + n + m + "さん");
    }
}

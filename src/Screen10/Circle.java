package Screen10;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径:"); double r = stdIn.nextDouble();

        System.out.println("円周の長さは" + 2 * Math.PI * r + "です");
        System.out.println("面積は" + Math.PI * r * r + "です");
    }
}

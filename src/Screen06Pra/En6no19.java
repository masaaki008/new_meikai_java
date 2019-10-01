package Screen06Pra;

import java.util.Scanner;

public class En6no19 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("クラス数:");
        int class_num = stdIn.nextInt();

        int[][] class_room = new int[class_num][];

        int class_all = 0;
        for (int i = 0; i < class_room.length; i++) {
            System.out.print((i + 1) + "組の人数:");
            int people = stdIn.nextInt();
            class_all += people;
            class_room[i] = new int[people];

            for (int j = 0; j < people; j ++) {
                System.out.print((i + 1) + "組" + (j + 1) + "番の点数:");
                class_room[i][j] = stdIn.nextInt();
            }
        }

        int[] classSubject = new int[class_num];

        for (int i = 0; i < class_room.length; i++) {
            for (int j = 0; j < class_room[i].length; j++) {
                classSubject[i] += class_room[i][j];
            }
        }

        System.out.println("　　組　　　合計　　平均　");
        System.out.println("----+-------------");
        for (int i = 0; i < class_room.length; i++) {
            System.out.printf("%2d組|%5d%6.1f\n", i + 1, classSubject[i], (double)classSubject[i] / class_room[i].length);
        }
        System.out.println("----+-------------");
        int sum = 0;
        for (int i = 0; i < classSubject.length; i++) {
            sum += classSubject[i];
        }
        System.out.printf("　　計|%5d%6.1f\n", sum, (double)sum / class_all);
    }
}

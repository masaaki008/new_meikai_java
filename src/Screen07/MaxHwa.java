package Screen07;

import java.util.Scanner;

// List7-1
public class MaxHwa {
    public static void main(String[] args) {
        // 3人の身長・体重・年齢の最大値を求めて表示
        Scanner stdIn = new Scanner(System.in);

        int[] height = new int[3];
        int[] weight = new int[3];
        int[] age = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("[" + (i + 1) + "] ");
            System.out.print("身長:"); height[i] = stdIn.nextInt();
            System.out.print("　　　　体重:"); weight[i] = stdIn.nextInt();
            System.out.print("　　　　年齢:"); age[i] = stdIn.nextInt();
        }

        int maxHeight = height[0];
        if (height[1] > maxHeight) maxHeight = height[1];
        if (height[2] > maxHeight) maxHeight = height[2];

        int maxWeight = weight[0];
        if (weight[1] > maxWeight) maxWeight = weight[1];
        if (weight[2] > maxWeight) maxWeight = weight[2];

        int maxAge = age[0];
        if (age[1] > maxAge) maxAge = age[1];
        if (age[2] > maxAge) maxAge = age[2];

        System.out.println("身長の最大値は" + maxHeight);
        System.out.println("体重の最大値は" + maxWeight);
        System.out.println("年齢の最大値は" + maxAge);
    }
}

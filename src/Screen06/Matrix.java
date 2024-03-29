package Screen06;

// List6-17
public class Matrix {
    public static void main(String[] args) {
        // 2行3列の行列を加算する
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{6, 3, 4}, {5, 1, 2}};
        int[][] c = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                c[i][j] = a[i][j] + b[i][j];

        System.out.println("行列a");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf("%3d", a[i][j]);
            System.out.println();
        }

        System.out.println("行列b");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf("%3d", b[i][j]);
            System.out.println();
        }

        System.out.println("行列c");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf("%3d", c[i][j]);
            System.out.println();
        }
    }
}

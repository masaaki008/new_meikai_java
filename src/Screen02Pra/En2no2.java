package Screen02Pra;

public class En2no2 {
    public static void main(String[] args) {
        // 3つのint型に値を代入して、合計と平均を求める
        int x; int y; int z;
        x = 15;
        y = 20;
        z = 25;

        // sum->60
        System.out.println("x, y, zの合計は" + (x + y + z));

        // ave->20
        System.out.println("x, y, zの平均は" + ((x + y + z)/3));
    }
}

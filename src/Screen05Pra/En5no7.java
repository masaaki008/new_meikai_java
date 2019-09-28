package Screen05Pra;

public class En5no7 {
    public static void main(String[] args) {
        System.out.println("float          float**2");
        System.out.println("-----------------------");

        for (float f = 0.0F; f <= 1.0F; f += 0.01F) {
            System.out.printf("%8.7f          %8.7f\n", f, f * f);
        }
    }
}

package Screen05Pra;

public class En5no6 {
    public static void main(String[] args) {
        System.out.println("float          int");
        System.out.println("------------------");

        float f_num;
        int int_num;
        for (int_num = 0, f_num = 0.0F; int_num <= 1000; int_num++, f_num += 0.001F) {
            System.out.printf("%8.7f          %8.7f\n", f_num ,(float)int_num/1000);
        }
    }
}

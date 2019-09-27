package Screen05;

// List5-1
public class DecOctHexLiteral {
    public static void main(String[] args) {
        // 整数リテラル(10進/8進/16進)
        int a = 13; // 10進
        int b = 013; // 8進
        int c = 0x13; // 16進

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.printf("a = %d\n", a); // 10進
        System.out.printf("a = %o\n", a); // 8進
        System.out.printf("a = %x\n", a); // 16進
    }
}

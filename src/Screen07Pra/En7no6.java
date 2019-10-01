package Screen07Pra;

public class En7no6 {
    static void printSeason(int m) {
        switch (m) {
            case 3:
            case 4:
            case 5: System.out.println("春"); break;
            case 6:
            case 7:
            case 8: System.out.println("夏"); break;
            case 9:
            case 10:
            case 11: System.out.println("秋"); break;
            case 12:
            case 1:
            case 2: System.out.println("冬");
        }
    }

    public static void main(String[] args) {
        printSeason(4);
        printSeason(7);
        printSeason(9);
        printSeason(1);
    }
}

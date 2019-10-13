package Screen09;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Today {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("今日は%04d年%02d月%02d日です\n", today.get(YEAR),
                today.get(MONTH) + 1, today.get(DATE));
    }
}

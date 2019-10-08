package car1;

// List8-4
public class Car {
    private String name;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double flue;

    Car(String name, int width, int height, int length, double flue) {
        this.name = name; this.width = width; this.height = height;
        this.length = length; this.flue = flue;
        x = y = 0.0;
    }

    double getX() { return x; }
    double getY() { return y; }
    double getFlue() { return flue; }

    void putSpec() {
        System.out.println("名前:" + name);
        System.out.println("車幅:" + width + "mm");
        System.out.println("車高:" + height + "mm");
        System.out.println("車長:" + length + "mm");
    }

    boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);

        if (dist > flue)
            return false;
        else {
            flue -= dist;
            x += dx;
            y += dy;
            return true;
        }
    }
}

package sample;

public class Rectangle {
    // Левый верхний угол
    public int x1;
    public int y1;

    // Правый нижний угол
    public int x2;
    public int y2;

    // Ширина и высота
    public int width;
    public int height;

    Rectangle(int x11, int y11, int x21, int y21) {
        this.x1 = x11;
        this.y1 = y11;
        this.x2 = x21;
        this.y2 = y21;
        height = y21 - y11;
        width = x21 - x11;
    }

    Rectangle(int width, int height) {
        this.x1 = 0;
        this.y1 = 0;

        this.height = height;
        this.width = width;

        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    Rectangle() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }

    void rect_print() {
        System.out.println("-----ПРЯМОУГОЛЬНИК-----");
        System.out.println("Левый верхний угол:");
        System.out.println("x1: " + x1);
        System.out.println("y1: " + y1);
        System.out.println("Правый нижний угол:");
        System.out.println("x2: " + x2);
        System.out.println("y2: " + y2);
        System.out.println("-----------------------");
    }

    void move(int dx, int dy) {
        x1 += dx;
        x2 += dx;
        y1 += dy;
        y2 += dy;
    }

    public Rectangle Union(Rectangle r) {
        int x1 = Math.min(this.x1, r.x1);
        int x2 = Math.max(this.x2, r.x2);
        int y1 = Math.min(this.y1, r.y1);
        int y2 = Math.max(this.y2, r.y2);
        return new Rectangle (x1, y1, x2, y2);
    }
}

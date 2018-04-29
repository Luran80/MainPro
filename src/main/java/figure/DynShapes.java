package figure;

public class DynShapes {
    public static void main(String[] args) {
        TwoDShape[] shapes = new TwoDShape[5];

        shapes[0] = new Triangle("Белый",6, 3);
        shapes[1] = new Rectangle(6);
        shapes[2] = new Triangle("Черный", 5);
        shapes[3] = new Rectangle(6, 3);
        shapes[4] = new Circle(6, "Закрашенный");


        System.out.println(shapes[4].area());
    }
}

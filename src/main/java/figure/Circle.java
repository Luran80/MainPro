package figure;

public class Circle extends TwoDShape {
    private String style;

    public Circle(double wh, String s) {
        super(wh, "Круг");
        style = s;
    }


    @Override
    double area() {
        return 3.14 * ((getHeight()/2) * (getHeight()/2));
    }
}

package figure;

public class Triangle extends TwoDShape {
    private String style;

    Triangle(){
        super();
        style = "none";
    }

    Triangle(String s, double w, double h){
        super(w, h, "Треугольник");
        style = s;
    }

    Triangle(String s, double wh){
        super(wh, "Треугольник");
        style = s;
    }

    Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Треугольник " + style);
    }



}

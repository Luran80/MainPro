package figure;

public final class Rectangle extends TwoDShape{

    Rectangle(){
        super();
    }

    Rectangle(double w, double h){
        super(w, h, "прямоугольник");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }
    Rectangle(double wh) {
        super(wh, "Прямоугольник");
    }

    double area(){
        return getHeight()*getHeight();
    }


}

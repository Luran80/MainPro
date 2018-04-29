package figure;

public abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape(){
        width = height = 0;
        name = "none";
    }

    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double wh, String n){
        width = height = wh;
        name =n;
    }

    TwoDShape(TwoDShape ob){
        ob.width = width;
        ob.height = height;
        ob.name = name;
    }

    double getWidth() { return width; }
    void setWidth(double width) { this.width = width; }
    double getHeight() { return height; }
    void setHeight(double height) { this.height = height; }
    String getName(){return name;}

    void showDim(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    abstract double area();
















}

import java.sql.SQLOutput;

public class Calculator {



    Rectangle rectangle = new Rectangle();
    Circle cirlce = new Circle();

    public int calculateRectangleArea(Rectangle rectangle){

        int a = rectangle.getP2().getY()-rectangle.getP1().getY(); //obliczam dlugosc boku prostokata
        int b = rectangle.getP4().getX()-rectangle.getP2().getX(); //obliczam dlugosc drugiego boku prostokata
        int rectangleArea = a * b;
        System.out.print("pole prostokata to: ");
        System.out.println(rectangleArea);
        return rectangleArea;

    }

    public void whetherIsInCircle(Circle circle){

        double d = Math.sqrt(Math.pow(circle.getMiddlePoint().getX()-circle.getAwayPoint().getX(),2)+Math.pow(circle.getMiddlePoint().getY()-circle.getAwayPoint().getY(),2));
        // d to liczona ze wzoru odleglosc miedzy punktem insideOutside i srodkiem okregu

        if (d==circle.getRadius()) System.out.println("punkt leży na okregu");
        else if(d>circle.getRadius()) System.out.println("punkt lezy poza okregiem");
        else if(d<circle.getRadius()) System.out.println("punkt lezy w obrebie okregu");

    }










}

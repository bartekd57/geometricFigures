import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {

/*
Program polega na stworzeniu tych wszystkich klas,
prostokat tworza zadeklarowane wierzcholki i obliczane jest pole prostokata
okrag ma swoj promien i srodek, sprawdzam czy zadeklarowany punkt awayPoint lezy na okregu, poza okregiem lub w srodku okregu

 */
        Point point1 = new Point(2,2);
        Point point2 = new Point(2,6);
        Point point3 = new Point(8,2);
        Point point4 = new Point(8,6);

        Point middlePoint = new Point(4,3);
        Point awayPoint = new Point(3,10);

        Rectangle rectangle = new Rectangle(point1,point2,point3,point4);
        Circle circle = new Circle(3,middlePoint, awayPoint);



        Calculator calculator = new Calculator();
        calculator.calculateRectangleArea(rectangle);
        calculator.whetherIsInCircle(circle);



    }
}

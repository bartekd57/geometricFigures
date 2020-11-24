public class Circle {

    private int radius;
    private Point middlePoint;
    private Point awayPoint;


    public Circle(int radius, Point middlePoint, Point awayPoint) {
        this.radius = radius;
        this.middlePoint = middlePoint;
        this.awayPoint = awayPoint;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getMiddlePoint() {
        return middlePoint;
    }

    public void setMiddlePoint(Point middlePoint) {
        this.middlePoint = middlePoint;
    }

    public Point getAwayPoint() {
        return awayPoint;
    }

    public void setAwayPoint(Point awayPoint) {
        this.awayPoint = awayPoint;
    }
}

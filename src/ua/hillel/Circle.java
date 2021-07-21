package ua.hillel;

public class Circle {
    private Point centre;
    private double radius;

    Circle(double x, double y, double radius){
        centre = new Point(x,y);
        this.radius = radius;
    }
    public boolean placedInCircle(Point p){
        double distanceToCentre = p.distanceToPoint(centre);
        if(distanceToCentre<= radius) {
            return true;
        }else {
            return false;
        }
    }
}

package ua.hillel;

public class Point {
    private double x;
    private double y;

    Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceToPoint(Point p){
        double dx = this.x - p.x;
        double dy = this.y - p.y;

        return Math.sqrt(dx*dx+dy*dy);
    }
}

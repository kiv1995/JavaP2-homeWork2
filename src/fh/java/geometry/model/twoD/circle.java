package fh.java.geometry.model.twoD;

import fh.java.geometry.model.twoD.circle;

/**
 * Created by Kevin on 13.11.2016.
 */
public class circle extends twoDShape {
    private double radius;
    public circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    //Berechnung von Fläche und Umfang
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double calculateVolume(){return 0;}
    public double calculateSurfaceArea(){return 0;}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        circle circle = (circle) o;

        return Double.compare(circle.radius, radius) == 0;

    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }
}

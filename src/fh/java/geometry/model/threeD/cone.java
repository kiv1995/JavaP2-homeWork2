package fh.java.geometry.model.threeD;

/**
 * Created by Kevin on 13.11.2016.
 */
public class cone extends threeDShape {
    private double radius;
    private double height;
    //constructor
    public cone(int x, int y,double radius,double height) {
        this.x=x;
        this.y=y;
        this.radius = radius;
        this.height = height;
    }
    //getter and setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //equal and hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cone cone = (cone) o;

        if (Double.compare(cone.radius, radius) != 0) return false;
        return Double.compare(cone.height, height) == 0;

    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    //Berechnung von Volumen und Umfang
    @Override
    public double calcArea() {
        return 0;
    }
    @Override
    public double calcPerimeter() {
        return 0;
    }
    @Override
    public double calculateVolume()
    {
        return (radius*radius*height*Math.PI)/3;
    }
    @Override
    public double calculateSurfaceArea()
    {
        return (Math.PI*radius*radius)+(Math.PI*radius*calcS());
    }
    public double calcS(){
        return Math.sqrt(radius*radius+height*height);
    }
    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cone{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", Volume=").append(calculateVolume());
        sb.append(", SurfaceArea=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();
    }
}

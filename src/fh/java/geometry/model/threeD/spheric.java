package fh.java.geometry.model.threeD;

/**
 * Created by Kevin on 13.11.2016.
 */
public class spheric extends threeDShape{
    private double radius;
    //Contrcutor
    public spheric(int x,int y,double radius) {
        this.x=x;
        this.y=y;
        this.radius = radius;
    }
    //Getter and Setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //Berechnung von Volumen und Oberfläche
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
        return (4*Math.PI*radius*radius*radius)/3.0;
    }
    @Override
    public double calculateSurfaceArea()
    {
        return (4*Math.PI*radius*radius);
    }
    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Spheric{");
        sb.append("radius=").append(radius);
        sb.append(", Volume=").append(calculateVolume());
        sb.append(", SurfaceArea=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();
    }
}

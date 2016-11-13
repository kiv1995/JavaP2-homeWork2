package fh.java.geometry.model.threeD;

/**
 * Created by Kevin on 13.11.2016.
 */
public class pyramid extends threeDShape{

    private double sideA;
    private double heightA;
    //Constructor
    public pyramid(int x, int y, double sideA, double heightA) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.heightA = heightA;
    }
    //Getter and setter
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getHeightA() {
        return heightA;
    }
    public void setHeightA(double heightA) {
        this.heightA = heightA;
    }
    //equal and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        pyramid pyramid = (pyramid) o;

        if (Double.compare(pyramid.sideA, sideA) != 0) return false;
        return Double.compare(pyramid.heightA, heightA) == 0;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightA);
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
        return ((sideA*sideA)*heightA)/3.0;
    }
    @Override
    public double calculateSurfaceArea()
    {
        return (sideA*sideA)+(sideA*heightA*2.0);
    }
    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramid{");
        sb.append("sideA=").append(sideA);
        sb.append(", heightA=").append(heightA);
        sb.append(", Volume=").append(calculateVolume());
        sb.append(", SurfaceArea=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();
    }
}

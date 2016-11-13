package fh.java.geometry.model.twoD;

/**
 * Created by Kevin on 13.11.2016.
 */
public class triangle extends twoDShape {
    private double sideA;
    private double heightA;
    private double sideB;
    private double sideC;
    //Constructor
    public triangle(int x, int y, double sideA, double heightA, double sideB, double sideC) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.heightA = heightA;
        this.sideB = sideB;
        this.sideC = sideC;
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
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    //equal and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        triangle triangle = (triangle) o;

        if (Double.compare(triangle.sideA, sideA) != 0) return false;
        if (Double.compare(triangle.heightA, heightA) != 0) return false;
        if (Double.compare(triangle.sideB, sideB) != 0) return false;
        return Double.compare(triangle.sideC, sideC) == 0;

    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    //calc Area and Perimeter
    public double calcArea()
    {
        return (sideA+heightA)/2.0;
    }
    @Override
    public double calcPerimeter()
    {
        return sideA+sideB+sideC;
    }
    @Override
    public double calculateVolume(){return 0;}
    public double calculateSurfaceArea(){return 0;}
    //ToString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle{");
        sb.append("sideA=").append(sideA);
        sb.append(", heightA=").append(heightA);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }
}

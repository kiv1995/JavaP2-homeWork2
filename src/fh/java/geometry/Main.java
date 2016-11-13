package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.twoD.circle;
import fh.java.geometry.model.twoD.trapeze;
import fh.java.geometry.model.twoD.triangle;
import fh.java.geometry.model.twoD.twoDShape;
import fh.java.geometry.model.threeD.cone;
import fh.java.geometry.model.threeD.pyramid;
import fh.java.geometry.model.threeD.spheric;
import fh.java.geometry.model.threeD.threeDShape;



import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();

    }
    public void doIt() {
        double areaSum=0;
        double periSum=0;
        double voluSum=0;
        double umfaSum=0;
        List<GeometricShape> shapeList = new ArrayList<>();
        fillList(shapeList);
        //printList(shapeList);
        for (GeometricShape shape : shapeList) {
            areaSum= areaSum +shape.calcArea();
            periSum = periSum + shape.calcPerimeter();
            voluSum = voluSum + shape.calculateVolume();
            umfaSum = umfaSum + shape.calculateSurfaceArea();
        }
        System.out.println("Summe aller Flächen 2D: "+areaSum);
        System.out.println("Summe der Umfänge 2D: "+periSum);
        System.out.println("Summe aller Volumen 3D: "+voluSum);
        System.out.println("Summe der Mantelfläche 3D: "+umfaSum);
    }
    public void fillList(List<GeometricShape> shapeList)
    {
        //TODO: Implement
        shapeList.add(new circle(1,2,3.0));
        shapeList.add(new circle(1,2,3.0));
        shapeList.add(new circle(1,2,3.2));

        shapeList.add(new triangle(1,2,1,2,3,4));
        shapeList.add(new triangle(1,2,2,3,4,5));
        shapeList.add(new triangle(1,2,5,6,7,8));

        shapeList.add(new trapeze(1,2,1,2,3,4,12));
        shapeList.add(new trapeze(1,2,2,3,4,5,11));
        shapeList.add(new trapeze(1,2,5,6,7,8,10));

        shapeList.add(new cone(1,2,2.0,3.0));
        shapeList.add(new cone(1,2,2.2,3.5));
        shapeList.add(new cone(1,2,2.0,3.0));

        shapeList.add(new pyramid(1,2,5,10));
        shapeList.add(new pyramid(1,2,5,10));
        shapeList.add(new pyramid(1,2,2.5,5.5));

        shapeList.add(new spheric(1,2,3.0));
        shapeList.add(new spheric(1,2,1.0));
        shapeList.add(new spheric(1,2,3.0));
        shapeList.add(new spheric(1,2,5.0));
    }
    /*public void printList(List<GeometricShape> shapeList) {
        System.out.println("--------- for --------");
        for (int pos=0;pos < shapeList.size();pos++){
            System.out.println(shapeList.get(pos));
        }

        System.out.println("--------- foreach --------");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }
        System.out.println("--------- stream 1 --------");
        shapeList.stream().forEach(shape -> System.out.println(shape));
        System.out.println("--------- for --------");
        shapeList.stream().forEach(System.out::println);

    }*/
}


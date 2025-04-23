package application;

import entities.Circle02;
import entities.Rectangle03;
import services.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa54 {
    public static void main(String[] args) {
//        List<Shape> myShapes = new ArrayList<>();
//        myShapes.add(new Rectangle03(3.0, 2.0));
//        myShapes.add(new Circle02(2.0));
//
//        List<Circle02> myCircles = new ArrayList<>();
//        myCircles.add(new Circle02(2.0));
//        myCircles.add(new Circle02(3.0));
//
//        System.out.println("Total area: " + totalArea(myCircles));
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObj = new ArrayList<>();

        copy(myInts, myObj);
        printList(myObj);
        copy(myDoubles, myObj);
        printList(myObj);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;

        for (Shape shape : list) {
            sum += shape.area();
        }
        return sum;
    }
}

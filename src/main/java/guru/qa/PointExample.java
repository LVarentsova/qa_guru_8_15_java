package guru.qa;

import java.util.Arrays;
import java.util.List;

public class PointExample {

    public static void main(String[] args) {

        Point p1 = new Point(1, 0),
              p2 = new Point(5, 10),
              p3 = new Point(9, 1),
              p4 = new Point(9, 5),
              p5 = new Point(0, 1);

        Point[] pointArray = {p1, p2, p3, p4, p5};

        Arrays.sort(pointArray, Point.getXComparator());

        System.out.println("Array of Points is sorted by x");
        for (Point element : pointArray) {
            System.out.println(element);
        }

        Arrays.sort(pointArray, Point.getYComparator());

        System.out.println("Array of Points is sorted by y");
        for (Point element : pointArray) {
            System.out.println(element);
        }

        List<Point> pointList = Arrays.asList(p1, p2, p3, p4, p5);

        pointList.sort(Point.getXComparator());

        System.out.println("List of Points is sorted by х");
        for (Point element : pointList) {
            System.out.println(element);
        }

        pointList.sort(Point.getYComparator());

        System.out.println("List of Points is sorted by y");
        for (Point element : pointList) {
            System.out.println(element);
        }
    }

}
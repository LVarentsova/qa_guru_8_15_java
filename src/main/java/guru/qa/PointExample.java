package guru.qa;

import org.openqa.selenium.Point;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PointExample {

    public static void main(String[] args) {

        Comparator<Point> comparatorX = (o1, o2) -> o1.getX() - o2.getX();
        Comparator<Point> comparatorY = (o1, o2) -> o1.getY() - o2.getY();

        Point p1 = new Point(1, 0),
              p2 = new org.openqa.selenium.Point(5, 10),
              p3 = new org.openqa.selenium.Point(9, 1),
              p4 = new org.openqa.selenium.Point(9, 5),
              p5 = new org.openqa.selenium.Point(0, 1);

        Point[] pointArray = {p1, p2, p3, p4, p5};

        Arrays.sort(pointArray, comparatorX);

        System.out.println("Array of Points is sorted by x");
        for (Point element : pointArray) {
            System.out.println(element);
        }

        Arrays.sort(pointArray, comparatorY);

        System.out.println("Array of Points is sorted by y");
        for (Point element : pointArray) {
            System.out.println(element);
        }

        List<Point> pointList = Arrays.asList(p1, p2, p3, p4, p5);

        pointList.sort(comparatorX);

        System.out.println("List of Points is sorted by х");
        for (Point element : pointList) {
            System.out.println(element);
        }

        pointList.sort(comparatorY);

        System.out.println("List of Points is sorted by y");
        for (Point element : pointList) {
            System.out.println(element);
        }
    }

}
package exercise2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> list = new LinkedList<>();

        list.add(new Point());
        list.add(new Line(6));
        list.add(new Circle(14));
        list.add(new Triangle(32, 24));
        list.add(new Square(24, 36));
        list.add(new Rectangle(22, 24));
        list.add(new Parallelogram(40, 72));


        for (Point element: list) {
            System.out.println(element);
        }
    }
}

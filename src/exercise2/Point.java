package exercise2;

public class Point {
    String type;
    int length;
    int area;

    public Point() {
        type = "point";
        length = 0;
        area = 0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", area=" + area +
                '}';
    }
}

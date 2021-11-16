package exercise2;

public class Triangle extends Line{

    public Triangle(int length, int area) {
        type = "triangle";
        this.length = length;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "type='" + type + '\'' +
                ", perimeter=" + length +
                ", area=" + area +
                '}';
    }
}

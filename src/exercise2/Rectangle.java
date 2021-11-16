package exercise2;

public class Rectangle extends Parallelogram{

    public Rectangle(int length, int area) {
        type = "rectangle";
        this.length = length;
        this.area = area;
    }

    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "type='" + type + '\'' +
                ", perimeter=" + length +
                ", area=" + area +
                '}';
    }
}

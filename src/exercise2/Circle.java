package exercise2;

public class Circle extends Point {

    public Circle(int length) {
        type = "circle";
        this.length = length;
        area = (int) (Math.pow(length, 2) / (4 * Math.PI));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", area=" + area +
                '}';
    }
}

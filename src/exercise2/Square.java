package exercise2;

public class Square extends Rectangle {

    public Square(int length, int area) {
        type = "square";
        this.length = length;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                ", perimeter=" + length +
                ", area=" + area +
                '}';
    }
}

package exercise2;

public class Line extends Point{
    public Line(int length) {
        this.type = "line";
        this.length = length;
        this.area = 0;
    }

    public Line() {
    }

    @Override
    public String toString() {
        return "Line{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", area=" + area +
                '}';
    }
}

package exercise2;

public class Parallelogram extends Line {

    public Parallelogram(int length, int area) {
        type = "parallelogram";
        this.length = length;
        this.area = area;
    }

    public Parallelogram() {
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "type='" + type + '\'' +
                ", perimeter=" + length +
                ", area=" + area +
                '}';
    }
}

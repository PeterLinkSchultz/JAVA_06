package study06.part1.lab29;

public interface Shape extends Comparable<Shape> {
    double getArea();
    void printInfo();

    default void printArea() {
        printInfo();
        System.out.println("Area = " + getArea());
    }

    @Override
    default int compareTo(Shape o) {
        return Double.compare(o.getArea(), getArea());
    }
}

package study06.part1.lab29;

public class Circle implements Shape {

    private final double range;

    Circle(double range) {
        this.range = range;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(range, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Circle | range = " + range);
    }

}

package study06.part1.lab29;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle | width = " + width + ", height = " + height);
    }
}

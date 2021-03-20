package study06.part1.lab29;

public class Triangle implements Shape {

    private final double ab;
    private final double bc;
    private final double ca;

    Triangle(double ab, double bc, double ca) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }

    @Override
    public double getArea() {
        double halfP = getPerimeter() / 2;

        return Math.sqrt(halfP * (halfP - ab) * (halfP - bc) * (halfP - ca));
    }

    private double getPerimeter() {
        return ab + bc + ca;
    }

    @Override
    public void printInfo() {
        System.out.println("Triangle | ab = " + ab + ", bc = " + bc + ", ca = " + ca);
    }
}

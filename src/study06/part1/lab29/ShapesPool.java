package study06.part1.lab29;

import java.util.*;

public class ShapesPool {

    Random random = new Random();
    List<Shape> shapeList = new ArrayList<>();

    ShapesPool(int size) {
        for (int i = 0; i < size; i++) {
            shapeList.add(generateShape());
        }
    }

    void searchMax() {
        Collections.sort(shapeList);
        shapeList.get(0).printArea();
    }

    private Shape generateShape() {
        return switch (random.nextInt(3)) {
            case 0 -> makeCircle();
            case 1 -> makeTriangle();
            default -> makeRectangle();
        };
    }

    private Circle makeCircle() {
        return new Circle(makeSize());
    }

    private Triangle makeTriangle() {
        double ab, bc, ca;

        do {
            ab = makeSize();
            bc = makeSize();
            ca = makeSize();
        } while (ab + bc <= ca || ab + ca <= bc || bc + ca <= ab);

        return new Triangle(ab, bc, ca);
    }

    private Rectangle makeRectangle() {
        return new Rectangle(makeSize(), makeSize());
    }

    private double makeSize() {
        return Math.round(random.nextDouble() * 10);
    }
}

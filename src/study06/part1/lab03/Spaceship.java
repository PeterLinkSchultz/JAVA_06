package study06.part1.lab03;

import java.util.*;

public class Spaceship {
    private final int speed;

    private static final List<Spaceship> list = new ArrayList<Spaceship>();

    public static void makeSpaceShip(int speed) {
        new Spaceship(speed);
    }

    public static double getAverageSpeed() {
        int averageSpeed = Spaceship.list.stream().mapToInt(Spaceship::getSpeed).sum();

        return (double) averageSpeed / Spaceship.list.size();
    }

    public static int getMinSpeed() {
        if (Spaceship.list.size() < 1) {
            return 0;
        }

        int min = Spaceship.list.get(0).getSpeed();

        for (int i = 1; i < Spaceship.list.size(); i++) {
            int current = Spaceship.list.get(i).getSpeed();

            if (current < min) {
                min = current;
            }
        }

        return min;
    }

    public Spaceship(int speed) {
        this.speed = speed;
        Spaceship.list.add(this);
    }

    public int getSpeed() {
        return speed;
    }

}

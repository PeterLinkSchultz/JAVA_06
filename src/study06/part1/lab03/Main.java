package study06.part1.lab03;


import study06.part1.lab03.Spaceship;

public class Main {

    public static void main(String[] args) {
        Spaceship.makeSpaceShip(140);
        Spaceship.makeSpaceShip(50);
        Spaceship.makeSpaceShip(100);

        System.out.println(Spaceship.getMinSpeed());
    }
}

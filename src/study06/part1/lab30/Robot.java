package study06.part1.lab30;

public class Robot {
    public Boolean leftLock = false;
    public Boolean rightLock = true;

    Robot() {
        AbstractLeg left = new AbstractLeg("left") {
            @Override
            public boolean ready() {
                return leftLock;
            }

            @Override
            public void next() {
                leftLock = false;
                rightLock = true;
            }
        };
        AbstractLeg right = new AbstractLeg("right") {
            @Override
            public boolean ready() {
                return rightLock;
            }

            @Override
            public void next() {
                rightLock = false;
                leftLock = true;
            }
        };

        new Thread(left).start();
        new Thread(right).start();
    }
}

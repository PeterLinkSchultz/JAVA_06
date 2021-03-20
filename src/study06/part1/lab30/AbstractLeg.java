package study06.part1.lab30;

import static java.lang.Thread.sleep;

public abstract class AbstractLeg implements Runnable {
    private static final Boolean isRun = true;
    String name = null;

    public static int steps = 20;
    AbstractLeg(String name) {
        this.name = name;
    }

    abstract boolean ready();

    abstract void next();

    @Override
    public void run() {
        for (int i = 0; i < steps; i++) {
            synchronized (AbstractLeg.isRun) {
                while (!ready()) {
                    try {
                        AbstractLeg.isRun.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name + " leg's is going!");
                try {
                    next();
                    AbstractLeg.isRun.notify();
                    sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

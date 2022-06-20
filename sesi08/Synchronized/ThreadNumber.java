package sesi08.Synchronized;

public class ThreadNumber extends Thread {
    private final NumberGenerator ng;

    public ThreadNumber(NumberGenerator ng) {
        this.ng = ng;
    }

    @Override
    public void run() {
        callGenerator();
    }

    private void callGenerator() {
        // syncronized
        for (int i = 0; i < 3; i++) {
            System.out.println(getName() + " " + ng.randomNumber());
        }
    }

    @Test
    public void testRun() {
        NumberGenerator generator = new NumberGenerator(1000, 2000);
        for (int i = 0; i < 3; i++) {
            new ThreadNumber(generator).start();
        }
    }
}
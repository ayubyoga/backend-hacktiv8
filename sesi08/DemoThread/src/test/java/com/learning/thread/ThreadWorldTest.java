package sesi08.DemoThread.src.test.java.com.learning.thread;

import org.junit.Test;

public class ThreadWorldTest {
    @Test
    public void testRun() {
        for (int i = 0; i < 5; i++) {
            ThreadWorld instance = new ThreadWorld();
            instance.setName("" + (i + 1));
            instance.start();
        }
    }
}
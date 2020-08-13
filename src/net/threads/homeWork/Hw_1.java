package net.threads.homeWork;

public class Hw_1 implements Runnable {
    private static int counter = 0;
    private final int id = counter++;

    public Hw_1() {
        System.out.println("I am in constructor");
    }

    @Override
    public void run() {
        System.out.println("I am in start of method run");
        Thread.yield();
        System.out.println("after Thread.yield()");
    }
}

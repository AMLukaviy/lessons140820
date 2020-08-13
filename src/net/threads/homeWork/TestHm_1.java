package net.threads.homeWork;

public class TestHm_1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Hw_1());
        Thread thread2 = new Thread(new Hw_1());
        Thread thread3 = new Thread(new Hw_1());
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("main is end");
    }
}

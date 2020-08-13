package net.threads.homeWork;

public class TestHm_2_Fib {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Hw_2_Fib(5));
        Thread th2 = new Thread(new Hw_2_Fib(6));
        Thread th3 = new Thread(new Hw_2_Fib(10));
        th1.start();
        th2.start();
        th3.start();
        System.out.println("i am tired");
    }
}

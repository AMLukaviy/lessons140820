package net.threads.homeWork;

import net.generics.Generator;

public class Hw_2_Fib implements Generator<Integer>, Runnable {
    private int count = 0;
    private int maxSeqFib = 0;
    private static int counter = 0;
    private final int id = counter++;

    Hw_2_Fib(int maxSeqFib){
        this.maxSeqFib = maxSeqFib;
    }

    public Integer next() {return Hw_2_Fib(count++);}

    public int Hw_2_Fib(int n) {
        if (n < 2) return 1;
        return Hw_2_Fib(n-2) + Hw_2_Fib(n -1);
    }

    @Override
    public void run() {
        System.out.println("Run" + id);
        /*for (int i = 0; i < maxSeqFib; i++) {
            System.out.print(this.next() + " ");
        }*/
        for (int i = 0; i < maxSeqFib; i++) {
            System.out.print(Hw_2_Fib(i) + " ");
        }
        Thread.yield();
    }
}

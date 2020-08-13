package net.threads.homeWork;

import net.generics.Generator;
import java.util.concurrent.Callable;

class Fib2 implements Generator<Integer> {
    private int count = 0;
    private int maxSeqFib = 0;
    private static int counter = 0;
    private final int id = counter++;

    Fib2(int maxSeqFib) {
        this.maxSeqFib = maxSeqFib;
    }

    public Integer next() {
        return Fib2(count++);
    }

    public int Fib2(int n) {
        if (n < 2) return 1;
        return Fib2(n - 2) + Fib2(n - 1);
    }
}

public class Hw_5_FibWithSum extends Fib2 implements Callable {
    private int count = 0;
    private static int counter = 0;
    private final int id = counter++;
    Hw_5_FibWithSum(int n) {
        super(n);
        count = n;
    }

    @Override
    public Object call() throws Exception {
        System.out.println("Call" + id);
        int result = 0;
        for (int i = 0; i < count; i++) {
            System.out.print(Fib2(i) + " ");
            result += Fib2(i);
        }
        return result;
    }
}

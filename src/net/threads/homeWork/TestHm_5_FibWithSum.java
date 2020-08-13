package net.threads.homeWork;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestHm_5_FibWithSum {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> resultsFib = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            resultsFib.add(exec.submit(new Hw_5_FibWithSum(5)));
        }

        for (Future<Integer> fi2 : resultsFib) {
            try {
                System.out.println(fi2.get());
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            } catch (ExecutionException e2) {
                e2.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}

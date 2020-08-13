package net.threads.homeWork;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

class RandSleep implements Callable {
    private static int counter = 0;
    private final int id = counter++;
    private int sleepTime = 0;

    RandSleep(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public Object call() throws Exception {
        TimeUnit.MILLISECONDS.sleep(sleepTime);
        return sleepTime;
    }
}

public class Hw_6_RandSleep {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> timers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            Random rand = new Random();
            timers.add(exec.submit(new RandSleep(rand.nextInt(2000))));
        }

        for (Future<Integer> fi : timers) {
            try {
                System.out.println(fi.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}

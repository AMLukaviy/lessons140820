package net.threads;

public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int tastCount = 0;
    private final int id = tastCount++;
    public LiftOff(){}
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status () {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "), ";
    }

    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}

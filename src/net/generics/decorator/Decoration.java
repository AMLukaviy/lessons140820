package net.generics.decorator;

import java.util.Date;

class Basic {
    private String value;
    public void set(String val) { value = val;}
    public String get() { return value;}
}

class Decorator extends Basic {
    protected Basic basic;
    public Decorator(Basic basic) { this.basic = basic;}
    public void set(String val) { basic.set(val);}
    public String get() {return basic.get();}
}

class TimeStamped extends Decorator {
    private final long timeStamp;
    public TimeStamped(Basic basic) {
        super(basic);
        timeStamp = new Date().getTime();
    }
    public long getTimeStamp() { return timeStamp;}
}

class SerialNumber extends Decorator{
    private static long counter = 1;
    private final long serialNumber = counter++;
    public SerialNumber(Basic basic) { super(basic);}
    public long getSerialNumber() { return serialNumber;}

}


public class Decoration {
    public static void main(String[] args) {
        TimeStamped t1 = new TimeStamped(new Basic());
        TimeStamped t2 = new TimeStamped(new SerialNumber(new Basic()));
        SerialNumber s1 = new SerialNumber(new Basic());
        SerialNumber s2 = new SerialNumber(new TimeStamped(new Basic()));
        s1.set("blalbabla");
        System.out.println(s1.get());
        System.out.println(s1.getSerialNumber());
        System.out.println(t1.getTimeStamp());
    }
}

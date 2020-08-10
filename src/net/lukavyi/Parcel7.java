package net.lukavyi;

import interfaces.Contents;

public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 111;
            public int value() { return i;}
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(p.contents().value());
    }
}

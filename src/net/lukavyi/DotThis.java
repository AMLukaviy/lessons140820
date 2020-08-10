package net.lukavyi;

public class DotThis {
    void f() { System.out.println("DotThis.f()");}
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }
}

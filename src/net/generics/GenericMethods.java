package net.generics;

public class GenericMethods {
    public <T, V, G> void f(T x, V v, G g) {
        System.out.println(x.getClass().getName() + "\t " +
                            v.getClass().getName() + "\t " +
                            g.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", "" , "");
        gm.f(1 , 3.0, 2f);
        gm.f(1.0, 1l, 2.5d);
        gm.f(1.0F, 2, 's');
        gm.f('c', "sdsds", 23);
        gm.f(gm, gm, gm);
    }
}

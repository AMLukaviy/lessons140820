package net.conteiners;

public abstract class Test<C> {
    String name;
    public Test(String nam) { this.name = name;}
    abstract int test(C container, TestParam tp);
}

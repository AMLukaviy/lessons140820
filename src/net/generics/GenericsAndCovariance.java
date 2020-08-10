package net.generics;

import java.util.ArrayList;
import java.util.List;

class Fruit{}
class Apple extends Fruit{}

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
        //flist.add(new Apple());
        flist.add(null);
        Fruit f = flist.get(0);
    }
}

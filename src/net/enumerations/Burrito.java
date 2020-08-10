package net.enumerations;

import static net.enumerations.Spiciness.HOT;
import static net.enumerations.Spiciness.MEDIUM;
import static net.enumerations.Spiciness.NOT;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) { this.degree = degree;}
    public String toString() { return "Burrito is " + degree;}

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
}

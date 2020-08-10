package net.generics;

import net.generics.enums.Watercolors;
import static net.generics.Sets.*;
import static net.generics.enums.Watercolors.*;

import java.util.EnumSet;
import java.util.Set;

public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union(set1, set2): " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subset);
        System.out.println("Difference(set1, subset): " + difference(set1, subset));
        System.out.println("Difference(set2, subset): " + difference(set2, subset));
        System.out.println("Complement(set1, set2): " + complement(set1, set2));
    }
}

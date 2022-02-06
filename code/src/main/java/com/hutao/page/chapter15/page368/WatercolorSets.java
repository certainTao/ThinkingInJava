package com.hutao.page.chapter15.page368;

import com.hutao.page.chapter15.page367.Sets;
import com.hutao.page.chapter15.page367.Watercolors;

import java.util.EnumSet;

import static com.hutao.page.chapter15.page367.Watercolors.*;
import static com.hutao.util.Print.*;
import static com.hutao.page.chapter15.page367.Sets.*;

public class WatercolorSets {
    public static void main(String[] args) {
        EnumSet<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        EnumSet<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);

        print("set1: " + set1);
        print("set2: " + set2);
        print("union(set1, set2): " + union(set1, set2));
        print("intersection(set1, set2): " + intersection(set1, set2));
        print("difference(set1, set2): " + difference(set1, set2));
        print("complement(set1, set2): " + complement(set1, set2));
    }
}

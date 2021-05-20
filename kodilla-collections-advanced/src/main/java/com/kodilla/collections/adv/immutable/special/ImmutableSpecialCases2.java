package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases2 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("-----");
        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("-----");
        Integer c = 100;                      // [1]
        Integer d = 100;                      // [2]
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = c + 10;                           // [3]
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = 10567;                            // [4]
        d = 10567;                            // [5]
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
    }
}

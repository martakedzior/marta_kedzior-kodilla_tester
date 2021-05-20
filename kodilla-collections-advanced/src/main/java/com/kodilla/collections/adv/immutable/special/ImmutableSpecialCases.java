package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args){
        Integer a = 112;
        Integer b = 112;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer c = 1160;
        Integer d = 1160;
        System.out.println(c == d );
        System.out.println(c.equals(d));

        Integer e = 128;
        Integer f = 128;
        System.out.println(e == f);
        System.out.println(e.equals(f));

        System.out.println("-----");
        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println(x.equals(y));


    }
}

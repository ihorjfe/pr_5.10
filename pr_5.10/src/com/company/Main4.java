package com.company;

public class Main4 {
    public static void main(String[] args) {
        int l = 1;
        int j = 1;

        for (int g = 1; g <= 10; g++, j++, l = l * j) {
            System.out.println(g + "! = " + l);
        }
        System.out.println();
        //While//
        int a, b, c;
        a = 0;
        b = 0;
        c = 1;
        while (a <= 9) {
            a++;
            b++;
            c = c * b;
            System.out.println(a + "!= " + c);
        }
    }
}
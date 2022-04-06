package com.company;

public class Main1 {

    public static void main(String[] args) {
        for (int n = 500; n<= 650; n = n + 10) {
            System.out.print(n + " ");
        }
        System.out.println();
        int a=500;
        while (a<=650) {
            System.out.print(a + " ");
            a=a+10;
        }
        System.out.println();
        int b = 500;
        do {
            System.out.print(b+" ");
            b=b+10;
        }while (b<=650);
        }
}
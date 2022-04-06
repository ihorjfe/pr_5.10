package com.company;

public class Main5 {
    public static void main(String[] args){

        int a,b,c,d,z,x;
        for (z=0;z <= 24;z++){
            a = z / 10;
            b = z % 10;
            for (x=0;x <= 59;x++){
                c = x / 10;
                d = x % 10;
                if(a==d&c==b){
                    System.out.println(a + "" + b + ":"+ c + "" + d);
                }
            }
        }
    }
}

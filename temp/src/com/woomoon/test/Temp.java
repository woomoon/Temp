package com.woomoon.test;

public class Temp {

    public static void main(String[] args) {

        System.out.println("test git commit ");

        int a = 3;
        add(a);
        System.out.println("a = "+a);
    }


    public static void add(int a) {
        a += a;
    }


}

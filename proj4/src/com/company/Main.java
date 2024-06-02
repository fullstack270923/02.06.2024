package com.company;

public class Main {

    // overloading
    private static int add(int x, int y) {
        return x + y;
    }
    private static float add(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 3.3f));
        System.out.println(add(1.3f, 9.88f));
    }
}

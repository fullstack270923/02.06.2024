package com.company;

public class Main {

    static int z = 1;

    // overloading
    private static int add(int x, int y) {
        z++;
        return x + y;
    }
    private static float add(float x, float y) {
        return x + y;
    }
    private static double add(double x, double y) {
        return x + y;
    }

    static void vegas(int x) {
        x++; // vegas_x
        return; // what happens in vegas stays in vegas
    }

    public static void main(String[] args) {
        System.out.println(add(1, 3)); // int
        System.out.println(add(1.3f, 9.88f)); // float
        System.out.println(add(1.3, 9.88)); // double
        // int z = 1; // override -- not recommended
        int x = 1; // main_x
        vegas(x); // vegas_x in a replication copy of main_x
        System.out.println(x); // 1
    }
}

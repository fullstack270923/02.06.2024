package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class Main_Exceptions {

    static Scanner scanner = new Scanner(System.in);

    static void crash() {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        catch (ArithmeticException ex) {
            // no
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public static void get_2_numbers_and_divide() {
        int num1 = 0, num2 = 0;
        try {
            System.out.println("Enter number 1:");
            num1 = scanner.nextInt();
            System.out.println("Enter number 1:");
            num2 = scanner.nextInt();
            float f = num1 / (float) num2;
            int result = num1 / num2;
            //System.out.println(num1 / num2);
            System.out.println(String.format("%d / %d = %f", num1, num2, num1 /  num2)); // -- 10 / 0.000000000000000000000001
        }
        catch (ArithmeticException ex) {
            System.out.println("Error: Divide by zero " + num1 + " / " + num2);
        }
        catch (IllegalFormatConversionException ex) {
            System.out.println("Error: Format error " + num1 + " / " + num2);
        }
        catch (Exception ex) {
            System.out.println("Unknown error " + ex.getMessage());
        }
    }

    static void checked_exception() throws FileNotFoundException {
        //throw new ArithmeticException(); // runtime - do nothing special

        // throw new FileNotFoundException(); // try or declare

        // try-catch
        try {
            throw new FileNotFoundException(); //
        }
        catch (FileNotFoundException ex) {

        }

        throw new FileNotFoundException(); // declare
    }

    static void foo() throws FileNotFoundException {
        checked_exception();
    }

    static void checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("the age " + age + " is not allowed");
        }
    }

    public static void main(String[] args) throws IOException, UnderAgeException {

        //crash();
        //get_2_numbers_and_divide();

        try {
            checked_exception();
        }
        catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }

        checkAge(20);

        MyFileReader.readFile("D:\\ecom\\fullstack27_09_23\\java\\02.06.2024\\proj4\\src\\com\\company\\Main_Exceptions.java");
    }

}

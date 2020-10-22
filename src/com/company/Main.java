package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final double Pi =3.14;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input radius:");
        double radius = Double.parseDouble(br.readLine());
        System.out.println("radius is" + radius);

        double area = Pi * Math.pow(radius,2);
        double perimeter = 2 * Pi * radius;

        System.out.println("Area of flower bed: " + area);
        System.out.println("Perimeter of flower bed: " + perimeter);
    }
}


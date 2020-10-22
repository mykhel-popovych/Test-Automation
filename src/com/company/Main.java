package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("a:");
        double a = Double.parseDouble(br.readLine());
        System.out.println("b:");
        double b = Double.parseDouble(br.readLine());
        System.out.println("c:");
        double c = Double.parseDouble(br.readLine());
        System.out.println("x:");
        double x = Double.parseDouble(br.readLine());
        System.out.println("y:");
        double y = Double.parseDouble(br.readLine());

        if((a <= x && b <= y) || (a <= y && b <= x)){
            System.out.println("Можна просунути");
        }
        else if((a <= x && c <= y) || (a <= y && c <= x)){
            System.out.println("Можна просунути");
        }
        else if((c <= x && b <= y) || (c <= y && b <= x)){
            System.out.println("Можна просунути");
        }
        else{
            System.out.println("Неможна просунути");
        }
    }
}


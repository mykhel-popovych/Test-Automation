package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What's your name ?");
        System.out.print("Input your name: ");
        String name = br.readLine();
        System.out.println("Where do you  live? ");
        System.out.print("Input your address: ");
        String address = br.readLine();
        System.out.print("Name is: " + name + " Address is: " + address);
    }
}


package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


class Person{
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person(){}

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    private int age(int birthYear){
        int age = 2020 - birthYear;
        return age;
    }

    void Information() throws Exception {
        String firstName;
        String lastName;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your firstName: ");
        firstName = br.readLine();
        if(firstName.isEmpty()){
            throw new Exception("Write some text!");
        }else{
            char[] char1 = firstName.toCharArray();
            for(char c : char1){
                if(Character.isDigit(c)){
                    throw new Exception("Please write only symbols!");
                }
            }
        }
        System.out.println("What is your lastName: ");
        lastName = br.readLine();
        if(lastName.isEmpty()) {
            throw new Exception("Write some text!");
        }else{
            char[] char2 = lastName.toCharArray();
            for(char c : char2){
                if(Character.isDigit(c)){
                    throw new Exception("Please write only symbols!");
                }
            }
        }
        System.out.println("FirstName: " + firstName + " LastName: " + lastName + " age: " + age(getBirthYear()));
    }
    void ChangeName() throws Exception{
        String newFirstName;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your new firstName: ");
        newFirstName = br.readLine();
        if(newFirstName.isEmpty()) {
            throw new Exception("Write some text!");
        }else{
            char[] chars3 = newFirstName.toCharArray();
            for(char c : chars3){
                if(Character.isDigit(c)){
                    throw new Exception("Please write only symbols!");
                }
            }
        }
        System.out.println("Your new firstName: " + newFirstName);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            Person tom = new Person("Tom", 2001);
            tom.Information();
            tom.ChangeName();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        Person bob = new Person("Bob", 2003);
        bob.Information();
        Person max = new Person("Max", 2004);
        max.Information();
        Person jack = new Person("Jack", 2006);
        jack.Information();
        Person emily = new Person("Emily", 2006);
        emily.Information();
    }
}



package com.company;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, MyException {
        Employee [] people = {
                new Employee("John"),
                new Employee("David"),
                new Employee("Abraham"),
                new Employee("Jack")
        };
        for(int i = 0; i < people.length; i++){
            try{
                people[i].InitializeSalary();
            }catch(MyException ex){
                System.out.println(ex.getMessage());
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        Arrays.sort(people);
        for(int i = people.length - 1; i >= 0; i--){
            System.out.println(people[i]);
        }
    }
}
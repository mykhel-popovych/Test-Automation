package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee implements Comparable<Employee>{
    private double salary;
    private String name;
    private int id;
    static int counter = 0;

    public Employee(String name){
        this.name = name;
        id = counter++;
    }

    void InitializeSalary() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write is worker with fixedSalary or no(yes or no): ");
        String findOut = br.readLine();
        if(findOut.equals("no")){
            System.out.print("What is hourly rate: ");
            double hourlyRate = Double.parseDouble(br.readLine());
            System.out.print("What is number of hours: ");
            double numberOfHours = Double.parseDouble(br.readLine());
            if(hourlyRate <= 0 || numberOfHours <= 0){
                throw new Exception("Please write hourly rate and number of house more than null!!");
            }else{
                salary = hourlyRate * numberOfHours;
            }
        }else if(findOut.equals("yes")){
            System.out.print("What is fixed monthly payment: ");
            salary = Double.parseDouble(br.readLine());
            if(salary <= 0){
                throw new Exception("Please write fixed payment more than null!!!");
            }
        }else{
            throw new MyException("Please write yes or no!!!", findOut);
        }
    }

    public double getSalary() {
        return salary;
    }

    public String toString(){
        return "[ID: " +  id + " Name: " + name + " Salary: " + salary + "]";
    }

    public int compareTo(Employee p){
        double compareSalary =  p.getSalary();
        return (int) (this.salary - compareSalary);
    }
}
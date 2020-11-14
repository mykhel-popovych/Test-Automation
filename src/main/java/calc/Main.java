package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class NotInRangeException extends Exception{

    private int number;

    public NotInRangeException(String s) {
    }

    public int getNumber(){return number;}
    public NotInRangeException(String message, int number){
        super(message);
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        double num1 = 0, num2 = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is the value of first number: ");
        try{
            num1 = Double.parseDouble(br.readLine());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.print("What is the value of second number: ");
        try{
            num2 = Double.parseDouble(br.readLine());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        DivReadNumber obj = new DivReadNumber();
        try{
            System.out.println("Dividing: " + obj.div(num1,num2));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        int resultReadNumber = 0;
        try{
            resultReadNumber = obj.readNumber(1,10);
        }catch(NumberFormatException | NotInRangeException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Number is : " + resultReadNumber);
        try{
            arrayBuild();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    static void arrayBuild() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> people = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            System.out.print("Write " + (i + 1) + " element of array: ");
            int variable = Integer.parseInt(br.readLine());
            if(people.contains(variable)){
                throw new Exception("All numbers must be different!!");
            }else if(variable <= 1 || variable >= 100){
                throw new Exception("Write numbers between 1 and 100");
            }else{
                people.add(variable);
            }
        }
        Collections.sort(people);
        System.out.print(people);
    }
}

package calc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class NotInRangeException extends Exception{
    private int number;

    public NotInRangeException(String s) {
        super(s);
    }

    public int getNumber(){return number;}
    public NotInRangeException(String message, int num){

        super(message);
        number = num;
    }
}

public class Main {
    public static void arrayBuild() throws NotInRangeException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[10];
        for(var i = 0; i < array.length; i++){
            System.out.print("Write " + (i + 1) + " element of array: ");
            array[i] += Integer.parseInt(br.readLine());
        }
        for(int c: array){
            if(c <= 1 || c >= 100){
                throw new NotInRangeException("Write numbers between 1 and 100");
            }
        }
        System.out.print("Sorted array is: ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

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
            ex.getMessage();
        }
        System.out.println("Number is : " + obj.readNumber(1,10));
        arrayBuild();
    }
}

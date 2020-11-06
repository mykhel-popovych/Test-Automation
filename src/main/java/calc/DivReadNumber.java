package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivReadNumber {
    public static double div(double num1, double num2) throws Exception {
        double divideTwoNumbers = num1 / num2;
        if(num2 == 0){
            throw new Exception("Dont divide on 0!");
        }
        return divideTwoNumbers;
    }
    public static int readNumber(int start, int end) throws NotInRangeException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        System.out.print("Write Number: ");
        try{
            number = Integer.parseInt(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
        if(number < start || number > end){
            throw new NotInRangeException("Write in range between: " + start + " and " + end);
        }else{
            return number;
        }
    }
    public static String readNumberForTest(int start, int end, int number){
        if(number < start || number > end){
            return "Out of range!";
        }else{
            return "Success!";
        }
    }
}

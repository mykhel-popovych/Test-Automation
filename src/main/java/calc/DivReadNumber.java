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
    public static int readNumber(int start, int end) throws NotInRangeException, Exception {
        int countIfNumberTest = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write Number: ");
        String number = br.readLine();
        if(number.isEmpty()){
            throw new NotInRangeException("Write some number!!!");
        }else if(number.length() > 0){
            char[] char1 = number.toCharArray();
            for(char c : char1){
                if(Character.isDigit(c)){
                    countIfNumberTest++;
                }
            }
            if(number.length() != countIfNumberTest){
                throw new Exception("Write only Number!!!");
            }else{
                if(Integer.parseInt(number) < start || Integer.parseInt(number) > end){
                    throw new NotInRangeException("Write in range between: " + start + " and " + end, Integer.parseInt(number));
                }else{
                    return Integer.parseInt(number);
                }
            }
        }
        return Integer.parseInt(number);
    }
    public static String readNumberForTest(int start, int end, int number){
        if(number < start || number > end){
            return "Out of range!";
        }else{
            return "Success!";
        }
    }
}

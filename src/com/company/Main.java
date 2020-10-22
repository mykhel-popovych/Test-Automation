package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n:");
        int n = Integer.parseInt(br.readLine());
        int squareN = (int)(Math.pow(n,2));
        System.out.println("Square of n:" + squareN);
        String strSquareN = Integer.toString(squareN);

        char[] result = strSquareN.toCharArray();
        char numberThree = '3';
        String message = null;
        for(int i = 0; i < result.length; i++){
            if(numberThree == result[i]){
                message = "Number is in this string!";
                break;
            }
            else{
                message = "Number isn't in this string!";
            }
        }
        System.out.println(message);

        System.out.print("Reversed number: ");
        StringBuilder reversedNumber = new StringBuilder(Integer.toString(n));
        System.out.println(reversedNumber.reverse().toString());

        char [] result2 = Integer.toString(n).toCharArray();

        if(result2.length <= 1){
            System.out.print("Number after permutation: " + n);
        }
        else{
            char temp = result2[0];
            result2[0] = result2[result2.length - 1];
            result2[result2.length - 1] = temp;
            System.out.print("Number after permutation: ");
            for(int i = 0; i < result2.length; i++){
                System.out.print(result2[i]);
            }
            System.out.println("\n");
        }
        System.out.print("Number with one number on the start and end:" + "1" + n + "1");
    }
}


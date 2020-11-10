package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BrickSize{
    private double a;
    private double b;
    private double c;

    public BrickSize(){}

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
}
class HoleSize{
    private double x;
    private double y;

    public HoleSize(){}

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getB(){
        return y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        double a = 0,b = 0,c = 0,x = 0,y = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("a:");
        try {
            a = Double.parseDouble(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Input number!!!");
        }
        System.out.println("b:");
        try {
            b = Double.parseDouble(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Input number!!!");
        }
        System.out.println("c:");
        try {
            c = Double.parseDouble(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Input number!!!");
        }
        System.out.println("x:");
        try {
            x = Double.parseDouble(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Input number!!!");
        }
        System.out.println("y:");
        try {
            y = Double.parseDouble(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Input number!!!");
        }

        BrickSize brickSize = new BrickSize();
        brickSize.setA(a);
        brickSize.setB(b);
        brickSize.setC(c);
        HoleSize holeSize = new HoleSize();
        holeSize.setX(x);
        holeSize.setX(y);
        

        if((brickSize.getA() <= holeSize.getX() && brickSize.getB() <= holeSize.getB()) ||
                (brickSize.getA() <= holeSize.getB() && brickSize.getB() <= holeSize.getX())){
            System.out.println("Можна просунути");
        }
        else if((brickSize.getA() <= holeSize.getX() && brickSize.getC() <= holeSize.getB()) ||
                (brickSize.getA() <= holeSize.getB() && brickSize.getC() <= holeSize.getX())){
            System.out.println("Можна просунути");
        }
        else if((brickSize.getC() <= holeSize.getX() && brickSize.getB() <= holeSize.getB()) ||
                (brickSize.getC() <= holeSize.getB() && brickSize.getB() <= holeSize.getX())){
            System.out.println("Можна просунути");
        }
        else{
            System.out.println("Неможна просунути");
        }
    }
}


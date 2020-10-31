package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BrickSize{
    private double a;
    private double b;
    private double c;

    public BrickSize(double a, double b, double c){
        this.a = a;
        this.b = b;
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

    public HoleSize(double x, double y){
        this.x = x;
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("a:");
        double a = Double.parseDouble(br.readLine());
        System.out.println("b:");
        double b = Double.parseDouble(br.readLine());
        System.out.println("c:");
        double c = Double.parseDouble(br.readLine());
        System.out.println("x:");
        double x = Double.parseDouble(br.readLine());
        System.out.println("y:");
        double y = Double.parseDouble(br.readLine());
        BrickSize brickSize = new BrickSize(a,b,c);
        HoleSize holeSize = new HoleSize(x,y);

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


package com.company;

import javax.swing.text.TabableView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Information{
    private String name;
    private String address;

    public Information(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void Show(String name, String address){
        System.out.println("Name is: " + name + " Address is: " + address);
    }
}

class Tariff{
    private double c1,c2,c3;
    private double t1,t2,t3;

    public Tariff(double c1, double c2, double c3, double t1, double t2, double t3){
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }
    public void Tariffs(double c1, double c2, double c3){
        System.out.println("Tariffs: " + "first" + c1 +" second: "+ c2 +"third: " + c3);
    }
    public void Time(double t1, double t2, double t3){
        System.out.println("Time of the first talk: "+ t1 +" of the second: "+ t2 +" of the third: "+t3);
    }
    public void Calculate(double c1, double c2, double c3, double t1, double t2, double t3){
        double countFirstTalk = c1*t1;
        double countSecondTalk = c2*t2;
        double countThirdTalk = c3*t3;
        double countAllTalks = countFirstTalk + countSecondTalk + countThirdTalk;
        System.out.println("Count for the first talk: " + countFirstTalk);
        System.out.println("Count for the second talk: " + countSecondTalk);
        System.out.println("Count for the third talk: " + countThirdTalk);
        System.out.println("Count for all talks: " + countAllTalks);
    }

}

class Flower{
    private double radius;

    public double setRadius() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input radius:");
        radius = Double.parseDouble(br.readLine());
        return radius;
    }

    public double getRadius() {
        return radius;
    }
    public void Calculate(double radius){
        double area = 3.14 * Math.pow(radius,2);
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Area of flower bed: " + area);
        System.out.println("Perimeter of flower bed: " + perimeter);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Address_Name task
        System.out.println("What's your name ?");
        System.out.print("Input your name: ");
        String name = br.readLine();
        System.out.println("Where do you  live? ");
        System.out.print("Input your address: ");
        String address = br.readLine();
        Information info = new Information(name,address);
        info.Show(name,address);

        //Tariff Task
        System.out.print("Tariff for the first country: ");
        double c1 = Double.parseDouble(br.readLine());
        System.out.print("Tariff for the second country: ");
        double c2 = Double.parseDouble(br.readLine());
        System.out.print("Tariff for the third country: ");
        double c3 = Double.parseDouble(br.readLine());
        System.out.print("Input time of the first talk: ");
        double t1 = Double.parseDouble(br.readLine());
        System.out.print("Input time of the second talk: ");
        double t2 = Double.parseDouble(br.readLine());
        System.out.print("Input time of the third talk: ");
        double t3 = Double.parseDouble(br.readLine());
        Tariff tariff = new Tariff(c1,c2,c3,t1,t2,t3);
        tariff.Tariffs(c1,c2,c3);
        tariff.Time(t1,t2,t3);
        tariff.Calculate(c1,c2,c3,t1,t2,t3);

        //Flower_task
        Flower flower = new Flower();
        flower.setRadius();
        flower.Calculate(flower.getRadius());
    }
}


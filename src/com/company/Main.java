package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Tariff for the first country: ");
        double c1 = Double.parseDouble(br.readLine());
        System.out.print("Tariff for the second country: ");
        double c2 = Double.parseDouble(br.readLine());
        System.out.print("Tariff for the third country: ");
        double c3 = Double.parseDouble(br.readLine());
        System.out.println("Tariffs: " + "first" + c1 +" second: "+ c2 +"third: " + c3);

        System.out.print("Input time of the first talk: ");
        double t1 = Double.parseDouble(br.readLine());
        System.out.print("Input time of the second talk: ");
        double t2 = Double.parseDouble(br.readLine());
        System.out.print("Input time of the third talk: ");
        double t3 = Double.parseDouble(br.readLine());
        System.out.println("Time of the first talk: "+ t1 +" of the second: "+ t2 +" of the third: "+t3);

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


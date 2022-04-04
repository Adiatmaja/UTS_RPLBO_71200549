package com.rplbo.tocm;

public class Main_71200549 {
    public static double FeetIncToCm (int inc){
        if(inc <= 0) {
            return -1;
        }else{
            double feet;
            double inch;
            feet = inc / 12;
            inch = inc % 12;
            System.out.println(inc + " inc = " + feet + " feet " + inch + " inc");
            return FeetIncToCm(feet, inch);
        }
    }

    public static double FeetIncToCm (double feet, double inch){
        if(feet <= 0 && inch <= 0 && inch > 12) {
            return -1;
        }else {
            double hasil;
            feet *= 12;
            inch += feet;
            hasil = inch * 2.54;
            System.out.println("Nilai dalam centimeter: " + hasil + " cm");
            return hasil;
        }
    }

    public static void main (String[] args){
        double tc1_1 = FeetIncToCm(1, 3);
        double tc1_2 = FeetIncToCm(15);

        double tc2_1 = FeetIncToCm(12, 5);
        double tc2_2 = FeetIncToCm(30);
    }
}

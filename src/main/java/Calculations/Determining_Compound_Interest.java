package Calculations;

import java.util.Scanner;

public class Determining_Compound_Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal interest: ");
        double a=scanner.nextDouble();
        System.out.println("Rate of interest: ");
        double b=scanner.nextDouble();
        System.out.println("Compound per year: ");
        int c=scanner.nextInt();
        System.out.println("Number of years: ");
        int t=scanner.nextInt();
        InterestPerYear(a,b,t);
        CalculateSimpleInterest(a,b,t);
        CompundPerYear(a,b,c,t);

    }
    private static void CompundPerYear(double a,double b,int c,int t)
    {
        double k=0;
        double i=0;
        double s;
        int h=0;
        double rate=b/100;
        for(int n=1;n<=t;n++)
        for(h=1;h<=c;h++)

            i = a * (Math.pow(1 + (rate/c),(h*n)));

        System.out.println("After " + (h-1) + " compounds at " + b + " %  per year, the investment will be worth $" + Math.round(i));
        }
    private static void InterestPerYear(double a,double b,int c)
    {
        double rate=b/100;
        for(int n=1;n<c;n++) {
            double i = a * (1 + (rate * n));
            System.out.println("After " + n + " years at " + b + " % , the investment will be worth $" + Math.round(i));
        }
    }
    private static double CalculateSimpleInterest(double a,double b,int c)
    {
        double rate=b/100;
        double i=a*(1+(rate*c));
        System.out.println("After "+c+" years at "+b+" % , the investment will be worth $"+Math.round(i));
        return i;
    }
}


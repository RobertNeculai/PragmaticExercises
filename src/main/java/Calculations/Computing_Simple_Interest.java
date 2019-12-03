package Calculations;

import java.util.Scanner;

public class Computing_Simple_Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal interest: ");
        double a=scanner.nextDouble();
        System.out.println("Rate of interest: ");
        double b=scanner.nextDouble();
        System.out.println("Number of years: ");
        int c=scanner.nextInt();
        InterestPerYear(a,b,c);
        CalculateSimpleInterest(a,b,c);

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

package Functions;

import java.util.Scanner;
public class Months_to_Pay_Off_a_Credit_Card {
    public static double balance;
    public static double Apr;
    public static double Monthly_Payment;
    public static void main(String[] args) {
        double a;
        Scanner s=new Scanner(System.in);
        System.out.println("What is your balance ?");
        balance=s.nextDouble();
        System.out.println("What is the APR on the card (as percentage) ");
        a=s.nextDouble();
        Apr=a/100;
        System.out.println("What is the monthly payment you can make ?");
        Monthly_Payment=s.nextDouble();
        calculateMonthsUntilPaidOff(balance,Apr,Monthly_Payment);
    }
    private static void calculateMonthsUntilPaidOff(double blnc,double apr,double Mp){
    double i=apr/365;
    double n;
    n=-(1.0/30)*((Math.log(1 + (blnc/Mp)* (1 - (Math.pow((1 + i), 30))))))/Math.log(1 + i);
    System.out.println("It will take you "+Math.round(Math.ceil(n))+" months to pay off this card. ");
    }
}

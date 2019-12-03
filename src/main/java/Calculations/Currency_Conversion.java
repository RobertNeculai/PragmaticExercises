package Calculations;

import java.util.Scanner;

public class Currency_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of currency: ");
        String name = scanner.next();
        System.out.println("How many " + name + " do you wish to exchange: ");
        double a = scanner.nextDouble();
        System.out.println("Name of currency being exchanged to: ");
        String name2 = scanner.next();
        System.out.println("At what exchange rate: ");
        double x = scanner.nextDouble();
        double b = (a *x);
        System.out.println(a + " " + name + " at an exchange rate of " + x + " is: " + Math.round(b)+" "+name2);
    }
}

package Calculations;


import java.util.Scanner;

public class Paint_Calculator {
    public static void main(String[] args) {
        System.out.println("Paint calculator v1.02");
        int f = 350;
        double f1 = 0.09290304;
        double a = 0;
        double b;
        String fe = "f";
        String me = "m";
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the lenght of the room ? ");
        String l = scanner.nextLine();
        System.out.println("What is the width of the room ? ");
        String w = scanner.nextLine();
        System.out.println("Type m for metric || Type f for feet");
        String m = scanner.nextLine();
        System.out.println("Entered Dimensions: " + l + " lenght " + w + " width");
        if (Numeric(l) && Numeric(w)) {
            a = Double.parseDouble(l) * Double.parseDouble(w);
            if (m.compareTo(fe) == 0) {
                System.out.println("The area is " + (int) a + " square feet");
                Paint(a, f);
            }
            if (m.compareTo(me) == 0) {
                b = a * f1;
                System.out.println("The area is " + (int) b + " square meters");
                Paint(b, (f * f1));
            }
        } else
            System.out.println("Not numeric values");
    }

    private static String pluralization(double a) {
        String s;
        if (a > 1)
            s = "s ";
        else
            s = "";
        return s;

    }

    public static boolean Numeric(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static void Paint(double a, double f) {
        double c;
        double b = a;
        c = a / f;
        if (a % f == 0)
            System.out.println("You will need: " + (int) c + " gallon" + pluralization(c) + " of paint to cover " + (int) b);
        else
            System.out.println("You will need: " + (int) (c + 1) + " gallon" + pluralization(c) + "\n" + ((int) (a % f)) + " has been used out of " + (int) f + " of the last gallon ");


    }

}
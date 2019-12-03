package Calculations;

import java.util.Scanner;

public class Area_of_Rectangular_Room {
    public static void main(String[] args) {
        double f = 0.09290304;
        String fe="f";
        String me="m";
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the lenght of the room ? ");
        String l = scanner.nextLine();
        System.out.print("What is the width of the room ? ");
        String w = scanner.nextLine();
        System.out.println("Type m for metric || Type f for feet");
        String m= scanner.nextLine();
        System.out.println("Entered Dimensions: " + l + " lenght " + w + " width");
        if (Numeric(l) && Numeric(w)) {
            double a = Double.parseDouble(l) * Double.parseDouble(w);
            if (m.compareTo(fe)==0)
                System.out.println("The area is " + a + " square feet");
            if (m.compareTo(me)==0) {
                double b = a * f;
                System.out.println("The area is " + b + " square meters");
            }
        }
         else
            System.out.println("Not numeric values");
    }

    public static boolean Numeric(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
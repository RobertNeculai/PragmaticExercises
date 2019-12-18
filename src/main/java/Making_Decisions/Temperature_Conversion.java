package Making_Decisions;

import java.util.Scanner;

public class Temperature_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n");
        String a=scanner.next();
        if (a.compareToIgnoreCase("F") == 0)
            tempF();
        else if (a.compareToIgnoreCase("C") == 0)
            tempC();
    }

    private static void tempF()
{
    System.out.println("Please enter temperature in Celsius: ");
    Scanner scanner=new Scanner(System.in);
    double t=scanner.nextDouble();
    System.out.println("Temperature in Fahrenheit is: "+((t*9/5)+32));
}
    private static void tempC()
    {
        System.out.println("Please enter temperature in Fahrenheit: ");
        Scanner scanner=new Scanner(System.in);
        double t=scanner.nextDouble();
        System.out.println("Temperature in Celsius is: "+((t-32)*5)/9);
    }
}

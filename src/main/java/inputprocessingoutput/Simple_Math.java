package inputprocessingoutput;


import java.util.Scanner;

public class Simple_Math {
    public static void main(String[] args) {
        double ad=0;
        double s=0;
        double m=1;
        double d=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " number:  ");
            String a = scanner.next();
            if(Numeric(a)) {
                if (Double.parseDouble(a) >= 0) {
                    ad = ad + Double.parseDouble(a);
                    s = Double.parseDouble(a) - s;
                    m = m * Double.parseDouble(a);
                    d = Double.parseDouble(a) / d;
                }
                else
                    System.out.println("No numeric value over 0 given");
            }
            else
                System.out.println("Not numeric value ");
        }
        if(ad==0 && s==0 && m==1 && d==1)
            System.out.println("No numeric value over 0 given");
        else
        System.out.println("Addition is: "+ad+"\n"+"Substraction: "+s+"\n"+"Multiplication: "+m+"\n"+"Division: "+d);
    }
    public static  boolean Numeric( String input )
    {
        try
        {
            Double.parseDouble( input );
            return true;
        }
        catch( Exception e)
        {
            return false;
        }
    }
}

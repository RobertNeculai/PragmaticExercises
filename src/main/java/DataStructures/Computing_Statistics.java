package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Computing_Statistics {
    private static ArrayList<String> x=new ArrayList<String>();
    public static void main(String[] args) {
        init();
        mathstuff();

    }
    private static void init() {
        Scanner s = new Scanner(System.in);
        String b;
        int ok = 0;
        while (ok != 1) {
            System.out.print("Enter a number: ");
            b = s.nextLine();
            if (b.equalsIgnoreCase("done"))
                ok = 1;
            else
                x.add(b);
        }
    }
    private static void mathstuff()
    {
        double a=0;
        double s=0;
        int i=0;
        double min=Double.parseDouble(x.get(0));
        double d=0;
        double dev=0;
        double max=Double.parseDouble(x.get(0));
        double m=0;
        double f=0;
        System.out.print("Numbers: ");
        for(String b:x)
            System.out.print(b+" ");
        System.out.println();
        for(String b:x)
        {

            a=a+Double.parseDouble(b);
            i++;
            if(Double.parseDouble(b)<min)
                min=Double.parseDouble(b);
            else if(Double.parseDouble(b)>max)
                max=Double.parseDouble(b);
        }
        s=a/i;
        for(String b:x)
        {
            m=a-Double.parseDouble(b);
            f=Math.pow(m,2);
            d=d+f;
        }
        d=d/i;
        dev=Math.sqrt(d);
        //calculate the difference from average to every number and square it
        //compute the average2 of the squared values
        //sqrt the average2
        System.out.println("The average is "+s);
        System.out.println("The minimum is "+min);
        System.out.println("The maximum is "+max);
        System.out.println("The standard deviation is "+dev);



    }
}

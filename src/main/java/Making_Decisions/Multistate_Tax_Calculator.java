package Making_Decisions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Multistate_Tax_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Order Amount: ");
        double a=scanner.nextDouble();
        double tax=0.50;
        double s=a;
        String c;
        System.out.println("What state: ");
        String b=scanner.next();
        DecimalFormat df = new DecimalFormat("###.###");
        if(b.compareToIgnoreCase("IL")==0 || b.compareToIgnoreCase("Illinois")==0)
            tax=tax+0.08;
       else if(b.compareToIgnoreCase("WI")==0 || b.compareToIgnoreCase("Wisconsin")==0) {
            System.out.println("What county: ");
            Scanner sc = new Scanner(System.in);
            c = sc.next();
            if (c.compareToIgnoreCase("EC") == 0 || c.compareToIgnoreCase("Eau Claire") == 0)
                tax = tax + 0.005;
            else if (c.compareToIgnoreCase("D") == 0 || c.compareToIgnoreCase("Dunn") == 0)
                tax = tax + 0.004;
        }
        s = s + tax;
        System.out.println(df.format(s));
    }
}

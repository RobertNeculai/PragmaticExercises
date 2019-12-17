package Making_Decisions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Tax_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Order Amount: ");
        double a=scanner.nextDouble();
        double tax=0.55;
        double s=a;
        System.out.println("What state: ");
        String b=scanner.next();
        DecimalFormat df = new DecimalFormat("###.###");
        if(b.compareToIgnoreCase("WI")==0 || b.compareToIgnoreCase("Wisconsin")==0)
             s= s+tax;
        System.out.println(df.format(s));

    }
}

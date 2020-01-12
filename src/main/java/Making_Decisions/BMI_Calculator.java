package Making_Decisions;

import java.util.Scanner;
public class BMI_Calculator {
    private static String m;
    public static void main(String[] args) {

        calc();
    }
   private static double hinit()
    {
        double h=0;
        String hm=null;
        Scanner s1=new Scanner(System.in);
        System.out.println("Choose m for meters or i for inches: ");
        hm=s1.next();
        m=hm;
        if(hm.contentEquals("m") || hm.contentEquals("i")) {
            if (hm.contentEquals("m")) {
                System.out.println("What is your height in m: ");
                h = s1.nextDouble();
            } else {
                System.out.println("What is your height inches : ");
                h = s1.nextDouble();
            }
        }
        else {
            System.out.println("Not a valid option");
            hinit();
        }
        return h;
    }
    private static double wInit()
    {
        double w=0;
        String wm;
        Scanner s2=new Scanner(System.in);
        System.out.println("Choose k for kg or p for pound: ");
        wm=s2.next();
        if(wm.contentEquals("p") || wm.contentEquals("k")) {
            if (wm.contentEquals("k")) {
                System.out.println("What is your weight in kg: ");
                w = s2.nextDouble();
            } else {
                System.out.println("What is your weight in pounds: ");
                w = s2.nextDouble();
            }
        }
        else {
            System.out.println("Not a valid option");
            wInit();
        }
        return w;
    }
   private static void calc()
    {
        double h,w,bmi=0;
        h=hinit();
        w=wInit();
        if(m.contentEquals("i"))
            bmi=(w/(h*h))*703;
        else {
            bmi = (w/(h*h));
        }
        System.out.println("Your bmi is: "+bmi);
        if(bmi>=18.5 && bmi<=25)
            System.out.println("You are in the ideal weight range");
        else
            System.out.println("You are overweight");

    }
}

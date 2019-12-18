package Making_Decisions;

import java.util.Scanner;

public class Blood_Alcohol_Calculator {
    public static void main(String[] args) {
        comp(BAC(init()));

    }
     static class Human{
        String gender;
        double weight;
        int dNumber;
        double aOAbVoD;
        double tSLD;
    }
    public static Human init()
    {
        Scanner scanner=new Scanner(System.in);
        Human human=new Human();
        System.out.println("Please enter Gender ");
        human.gender=scanner.nextLine();
        System.out.println("Please enter your weight in Kg: ");
        human.weight=scanner.nextDouble();
        System.out.println("Please enter number of drinks consumed: ");
        human.dNumber=scanner.nextInt();
        System.out.println("Please enter the amount of alcohol by volume of the drinks consumed (Alcohol %): ");
        human.aOAbVoD=(scanner.nextDouble()/100);
        System.out.println("Please enter time since last drink in H: ");
        human.tSLD=scanner.nextDouble();
        return human;

    }
    public static double BAC(Human a)
    {
        double m=0.73;
        double f=0.66;
        double w=0;
        if(a.gender.compareToIgnoreCase("M")==0|| a.gender.compareToIgnoreCase("Male")==0)
            w=a.weight*m;
        if(a.gender.compareToIgnoreCase("F")==0|| a.gender.compareToIgnoreCase("Female")==0)
            w=a.weight*f;
        double bac=(((a.aOAbVoD*a.dNumber)*5.14)/w)-(0.015*a.tSLD);
        if(bac>0)
        System.out.println("Your BAC is : "+(bac));
        else
            System.out.println("BAC is less than 0");
        return bac;
    }
    public static void comp(double a)
    {
        if(a>0.08)
            System.out.println("You should not be driving ! Take a cab or face the consequences");
        if(a>0 && a<0.08)
            System.out.println("Woudn't recommand to drive,but it is still legal");
        if(a<0)
            System.out.println("You can drive safely");
    }
}

package Repetitions;

import java.util.Scanner;

public class Handling_Bad_Input {
    private static String r;
    public static void main(String[] args) {
        Init();

    }
    private static void Init()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("What is the rate of return ?");
        r=s.nextLine();
        if(Validation(r)==1)
            yfr(r);
        else
            Init();
    }
    private static int Validation(String a)
    {
        int ok=0;
        int x=Integer.parseInt(a);
        if(a.matches("(?=.*[0-9]).*") && x<=100 && x!=0)
            ok=1;
        else if(x!=0)
            System.out.println("Rate of return must be numeric and under 100%");
        else if(x==0)
            System.out.println("Rate of return cannot be 0");
        return ok;

    }
    private static void yfr(String a)
    {
        int x=Integer.parseInt(a);
        int y=72/x;
        System.out.println("It will take "+y+" years to double your initial investment");
    }
}

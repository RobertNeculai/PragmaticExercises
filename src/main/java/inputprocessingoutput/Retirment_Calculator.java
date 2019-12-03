package inputprocessingoutput;

import java.time.Year;
import java.util.Scanner;

public class Retirment_Calculator {
    public static void main(String[] args){
        double b=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String n=scanner.nextLine();
        System.out.println("Enter Age: ");
        String a=scanner.nextLine();
        System.out.println("Enter Prefered Age of Retirment: ");
        String r=scanner.nextLine();
        System.out.println("Year now :"+ Year.now()+" at the age of "+a);
        b=Double.parseDouble(r)-Double.parseDouble(a);
        if(b<=0)
            System.out.println(n+" can already retire");
        else {
            double c = Double.parseDouble(String.valueOf(Year.now())) + b;
            System.out.println("Retirement in :" + c + " years");
        }


    }
}
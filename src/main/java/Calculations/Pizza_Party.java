package Calculations;

import java.util.Scanner;

public class Pizza_Party {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many people: ");
        String n=scanner.nextLine();
        System.out.println("How many Pizzas: ");
        String p=scanner.nextLine();
        System.out.println("How many Slices per Pizza: ");
        String s=scanner.nextLine();
        if(Numeric(n) && Numeric(p) && Numeric(s)) {
            int slices = Integer.parseInt(p) * Integer.parseInt(s);
            int portion = slices / Integer.parseInt(n);
            int lo=slices%Integer.parseInt(n);
            if(portion>=1)
                System.out.println("Each person gets: " + portion +" slice"+ pluralization(portion)+" \n"+lo+" left over slice"+pluralization(lo));
            else
                System.out.println("Not enough slices for everyone");

        }
        else
            System.out.println("Not numeric values");
        howManyPizza();

    }
    private static String pluralization(int a)
    {
        String s;
        if(a>1)
            s="s ";
        else
           s="";
        return s;

    }
    public static boolean Numeric(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    private static void howManyPizza()
    {
        System.out.println("Welcome to Pizza Calculator");
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Number of people: ");
        String n=scanner.next();
        System.out.println("Number of slices: ");
        String s=scanner.next();
        a=(Integer.parseInt(n) * Integer.parseInt(s));
        a=a/8;
        if(a%8==0)
        System.out.println("You will need: "+a+" pizzas");
        else
            System.out.println("You will need: "+(a+1)+" pizza"+pluralization(a)+"\n"+(8-(a%8))+" slice"+pluralization(a%8)+" will be remaining");


    }
}

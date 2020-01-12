package Making_Decisions;

import java.util.Scanner;

public class Numbers_To_Names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String b = null;
        System.out.println("Prefered Langueage: R for Romanian or E for English");
        b=sc.nextLine();
        if(b.compareToIgnoreCase("R")==0)
            monthR();
        else if(b.compareToIgnoreCase("E")==0)
            month();

    }

    private static void month() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        int a = sc1.nextInt();
        if (a >= 1 && a <= 12) {
            switch (a) {
                case 1:
                    System.out.println("The name of the month is January");
                    break;
                case 2:
                    System.out.println("The name of the month is February");
                    break;
                case 3:
                    System.out.println("The name of the month is March");
                    break;
                case 4:
                    System.out.println("The name of the month is April");
                    break;
                case 5:
                    System.out.println("The name of the month is May");
                    break;
                case 6:
                    System.out.println("The name of the month is June");
                    break;
                case 7:
                    System.out.println("The name of the month is July");
                    break;
                case 8:
                    System.out.println("The name of the month is August");
                    break;
                case 9:
                    System.out.println("The name of the month is September");
                    break;
                case 10:
                    System.out.println("The name of the month is October");
                    break;
                case 11:
                    System.out.println("The name of the month is November");
                    break;
                case 12:
                    System.out.println("The name of the month is December");
                    break;
            }
        } else
            System.out.println("There is no " + a + " month");
    }
    private static void monthR() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Va rugam introduceti numarul lunii: ");
        int a = sc1.nextInt();
        if (a >= 1 && a <= 12) {
            switch (a) {
                case 1:
                    System.out.println("Numele acestei luni este Ianuarie");
                    break;
                case 2:
                    System.out.println("Numele acestei luni este Februarie");
                    break;
                case 3:
                    System.out.println("Numele acestei luni este Martie");
                    break;
                case 4:
                    System.out.println("Numele acestei luni este Aprilie");
                    break;
                case 5:
                    System.out.println("Numele acestei luni este Mai");
                    break;
                case 6:
                    System.out.println("Numele acestei luni este Iunie");
                    break;
                case 7:
                    System.out.println("Numele acestei luni este Iulie");
                    break;
                case 8:
                    System.out.println("Numele acestei luni este August");
                    break;
                case 9:
                    System.out.println("Numele acestei luni este Septembrie");
                    break;
                case 10:
                    System.out.println("Numele acestei luni este Octombrie");
                    break;
                case 11:
                    System.out.println("Numele acestei luni este Noiembrie");
                    break;
                case 12:
                    System.out.println("Numele acestei luni este Decembrie");
                    break;
            }
        } else
            System.out.println("Nu exista luna " + a);
    }
}

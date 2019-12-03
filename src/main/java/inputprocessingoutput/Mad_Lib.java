package inputprocessingoutput;

import java.util.Scanner;

public class Mad_Lib {
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        String p=scanner.nextLine();
        System.out.println("Enter a noun: ");
        String n=scanner.nextLine();
        System.out.println("Enter a verb: ");
        String v=scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String a=scanner.nextLine();
        System.out.println("Enter an adverb: ");
        String ad=scanner.nextLine();
        System.out.println("Enter an sentence ending: ");
        String se=scanner.nextLine();
        String story=" Seriosly?! Can't be true. Might want to double check you facts,sir! ";
        String ps=String.format("%s %s %s %s %s. %s",v,a,n,ad,se,story);
        System.out.println("Did "+p+" just say that "+ps);
    }
}

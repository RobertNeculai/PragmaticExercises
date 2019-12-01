package inputprocessingoutput;

import java.util.Scanner;

public class Printing_Quotes {
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("What is the Quote ?");
        String s1=scanner.nextLine();
        System.out.print("By ");
        String s2=scanner.nextLine();
        System.out.println(s2+" says "+"\""+s1+ "\"");

    }

}

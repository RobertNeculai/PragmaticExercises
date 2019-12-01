package inputprocessingoutput;

import java.util.Scanner;

public class Counting_The_Number_Of_Characters {
    public static void main( String[] args )
    {
        System.out.println("What is the imput string ? ");
        Scanner scanner=new Scanner(System.in);
        String scan=scanner.next();
        if(scan.length()!=0)
        System.out.println("Input string "+scan+" has "+scan.length()+" characters");
        else
            System.out.println("Enter a string");
    }
}

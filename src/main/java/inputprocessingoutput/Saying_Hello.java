package inputprocessingoutput;

import java.util.Scanner;

public class Saying_Hello {
    public static void main( String[] args )
    {
        System.out.println("What is your name? ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello "+scanner.next()+"! Nice to meet you");
    }
}

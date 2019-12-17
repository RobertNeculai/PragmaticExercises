package Making_Decisions;
import java.io.Console;
import java.util.Scanner;

public class Password_Validation {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter password: ");
       String pass=scanner.next();
       String ab="1234aA";
       if(ab.compareTo(pass)==0)
           System.out.println("Password Correct");
       else
           System.out.println("Password Incorrect");

    }
}

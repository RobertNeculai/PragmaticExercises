package Making_Decisions;

import java.util.Scanner;

public class Troubleshooting_Car_Issues {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String  a;
        System.out.println("Is the car silent when you turn the key?");
        a=s.nextLine();
        if(a.compareToIgnoreCase("y")==0) {
            System.out.println("Are the battery terminals corroded?");
            a = s.nextLine();
            if (a.compareToIgnoreCase("y") == 0)
                System.out.println("Clean terminals and try starting again.");
            else if (a.compareToIgnoreCase("n") == 0)
                System.out.println("Replace cables and try again.");
            else
                System.out.println("Not a valid answer");
        }
        else if(a.compareToIgnoreCase("n")==0)
        {
            System.out.println("Does the car make a clicking noise?");
            a = s.nextLine();
            if(a.compareToIgnoreCase("y") == 0)
                System.out.println("Replace the battery.");
            else if(a.compareToIgnoreCase("n") == 0) {
                System.out.println("Does the car crank up but fail to start?");
                a = s.nextLine();
                if(a.compareToIgnoreCase("y") == 0)
                    System.out.println("Check spark plug connections.");
                else if(a.compareToIgnoreCase("n") == 0)
                {
                    System.out.println("Does the engine start and then die?");
                    a=s.nextLine();
                    if(a.compareToIgnoreCase("y") == 0)
                        System.out.println("Get it in for service.");
                    else if(a.compareToIgnoreCase("n") == 0)
                        System.out.println("Check to ensure the choke is opening and closing.");
                    else
                        System.out.println("Sorry ,didn't think you would afford a Tesla. Can't help you with this");
                }
                else
                    System.out.println("Not a valid asnwer");

            }
            else
                System.out.println("Not a valid asnwer");

        }
        else
            System.out.println("Not a valid asnwer");

    }
}

package Making_Decisions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Legal_Driving_Age {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Age: ");
        int age=scanner.nextInt();
        class Country{
            String name;
            int dA;


            public Country(String name, int dA) {
                this.name = name;
                this.dA = dA;
            }
        }
        Country[] countries=new Country[3];
        countries[0]=new Country("Romania",18);
        countries[1]=new Country("US",16);
        countries[2]=new Country("Japan",21);
        for(int i=0;i<countries.length;i++) {
            if (age < countries[i].dA)
                System.out.println("You are not old enough to legaly drive in "+countries[i].name);
            else
                System.out.println("You are old enough to drive legaly "+countries[i].name);
        }
    }
}

package Repetitions;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guess_the_Number_Game {
    public static void main(String[] args) {
        guessingGamee();

    }
    private static void guessingGamee() {
        int ok = 0;
        int n = 0;
        int c=0;
        int a;
        String b;
        Scanner s = new Scanner(System.in);
        System.out.println("Pick the difficulty level (1,2,3) :");
        int d = s.nextInt();
        n = rNumber(d);
        System.out.println("I have my number");
        while (ok != 1) {
            Scanner s1 = new Scanner(System.in);
            c++;
            System.out.println("What is your guess ?");
            b = s1.nextLine();
            if(validator(b)==1)
            {
                a=Integer.parseInt(b);
                if(a==n) {
                    System.out.println("Good job ! That was my number. Only took you "+c+" guesses");
                    mapper(c);
                    ok=1;
                }
                else if(a<n)
                    System.out.println("Too low , try again");
                else if(a>n)
                    System.out.println("Too high , try again");
            }
        }
    }
    private static int validator(String a) {
        int x=0;
        if(a.matches("(?=.*[0-9]).*"))
            x=1;
        else
            System.out.println("Not a numeric value, Be aware that the value has to be Integer type");
        return x;
    }
    private static int rNumber(int d)
    {
        int x=0;
        if(d==1)
            x= ThreadLocalRandom.current().nextInt(1,10);
        else if(d==2)
            x= ThreadLocalRandom.current().nextInt(1,100);
        else if(d==3)
            x= ThreadLocalRandom.current().nextInt(1,1000);
        return x;
    }
    private static void mapper(int a)
    {
        if(a==1)
            System.out.println("You're a mind reader !");
        else if(a>1 && a<5)
            System.out.println("Most impressive");
        else if(a>6)
            System.out.println("Better luck next time");
        if(a>2 && a<7)
            System.out.println("You can do better than that");
    }
}

package DataStructures;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Magic_8_Ball {
    public static void main(String[] args) {
        init();
        Ballresponse();

    }
    private static void init(){
        Scanner s=new Scanner(System.in);
        System.out.println("What is your question ?");
        String a=s.nextLine();
    }
    private static void Ballresponse(){
        int x= ThreadLocalRandom.current().nextInt(1,4);
        if(x==1)
                System.out.println(" Yes !");
        else if(x==2)
                System.out.println(" Maybe it's in the cards for you");
        else if(x==3)
                System.out.println("Definitly no");
        else if(x==4)
            System.out.println("Ask again later, my mojo is low at the moment");
        }
    }

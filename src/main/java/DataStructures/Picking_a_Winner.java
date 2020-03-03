package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Picking_a_Winner {
    private static ArrayList<String> a = new ArrayList<String>();

    public static void main(String[] args) {
        init();
        winner();
    }

    private static void init() {
        Scanner s = new Scanner(System.in);
        String b;
        int ok = 0;
        while (ok != 1) {
            System.out.print("Enter a name: ");
            b = s.nextLine();
            if (b.equalsIgnoreCase(""))
                ok = 1;
            else
                a.add(b);
        }
    }
    private static void winner() {
        int ok = 0;
        int i = 1;
        while (ok != 3 && a.size()>0) {
            int c=a.size();
            int x = ThreadLocalRandom.current().nextInt(0,c);
            System.out.println(i + " Place Winner is: " + a.get(x));
            a.remove(x);
            i++;
            ok++;
        }
    }
}

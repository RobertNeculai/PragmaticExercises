package DataStructures;

import java.sql.Connection;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Password_Generator {
    private static int l;
    private static int sc;
    private static int n;
    private static Random r = new Random();
    private static ArrayList<Character> pass = new ArrayList<Character>();

    public static void main(String[] args) {
        init();
        l=ThreadLocalRandom.current().nextInt(l,l*2);
        generatePass(l,sc,n);

    }
    private static void init() {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the minimum lenght of the password ? ");
        l = s.nextInt();
        System.out.println("How many special characters");
        sc = s.nextInt();
        System.out.println("How many numbers ? ");
        n = s.nextInt();
    }

    private static void generatePass(int a, int b, int c) {
        int ok = 0;
        int d = 0;
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";

        String passLetters = charsCaps + chars;
        String passSpecial = symbols;
        String passNums = nums;
        int e=a-(b+c);
        char[] password = new char[a];
        for (int i = 0; i <e; i++) {
            ok = i;
            password[i] = passLetters.charAt(r.nextInt(passLetters.length()));
            pass.add(password[i]);
        }
        for (int j = 0; j <b; j++) {
                password[j+ok] = passSpecial.charAt(r.nextInt(passSpecial.length()));
                pass.add(password[j+ok]);
                d=j+ok;
            }
        for(int k=0;k<n;k++)
        {
                password[k+d] = passNums.charAt(r.nextInt(passNums.length()));
                pass.add(password[k+d]);
            }
        System.out.println("3 Possible passwords generated: ");
       for(int shuff=0;shuff<3;shuff++) {
           Collections.shuffle(pass);
           for (int k = 0; k < pass.size(); k++)
               System.out.print(pass.get(k));
           System.out.println();
       }
    }
}

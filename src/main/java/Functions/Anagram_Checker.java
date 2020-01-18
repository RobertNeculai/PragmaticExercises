package Functions;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Checker {
    private static char[] x;
    public static void main(String[] args) {
        wordInit();
    }
    private static void wordInit()
    {
        Scanner sc1= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter first string: ");
        String a=sc1.next();
        System.out.println("Enter second string: ");
        String b=sc2.next();
        if(isAnagram(a,b))
            System.out.println("String "+a+" and String "+b+" are anagrams");
        else
            System.out.println("String "+a+" and String "+b+" are not anagrams");

    }
    private static boolean isAnagram(String a,String b){
        boolean ok=false;
        if(a.length()==b.length())
        {
            char[] a1=a.toCharArray();
            char[] b1=b.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            if(Arrays.equals(a1,b1))
            ok=true;
            else
                ok=false;
        }
        return ok;

    }
}

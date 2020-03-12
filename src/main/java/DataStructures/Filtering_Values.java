package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Filtering_Values {
    private static ArrayList<Integer> num = new ArrayList<Integer>();
    public static void main(String[] args) {
        init();
        filterEvenNumbers();

    }
    private static void init() {
        System.out.println("Enter a list of numbers, separated by spaces:");
        Scanner scan = new Scanner(System.in);
        String s[]= scan.nextLine().split(" ");
        for(int i =0 ;i < s.length;i++){
            num.add(Integer.parseInt(s[i]));
        }
    }
    private static void filterEvenNumbers()
    {
        ArrayList<Integer> evenNum = new ArrayList<Integer>();
        for(Integer n:num)
        {
            if(n%2==0)
                evenNum.add(n);
        }
        System.out.print("The even numbers are");
        for(Integer a:evenNum) {
            System.out.print(" "+a);
        }
        System.out.print(".");

    }

}

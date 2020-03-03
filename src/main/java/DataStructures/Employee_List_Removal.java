package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee_List_Removal {
    static ArrayList<String> a = new ArrayList<String>();

    public static void main(String[] args) {
        init();
        remover();
    }

    private static void init() {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("How many employees do u want to register ?");
        n = s.nextInt();
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("First and Last name of the employee");
            a.add(i, s1.nextLine());
        }
    }

    private static void remover() {
        System.out.println("There are " + a.size() + " employees");
        String b=null;
        for (String nm : a)
            System.out.println(nm);
        System.out.println("Enter an employee name to remove: ");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        for (String nm : a) {
            if (nm.equalsIgnoreCase(x))
                b=nm;
            else
                System.out.println("This name does not exist");
        }
        a.remove(b);
        System.out.println("There are " + a.size() + " employees");
        for (String nm : a)
            System.out.println(nm);
    }
}
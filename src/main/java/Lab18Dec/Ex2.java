package Lab18Dec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Test numbers: ");
        int t = s.nextInt();
        if (t <= 100 && t >= 1) {
            for (int i = 0; i < t; i++) {
                ArrayList A = new ArrayList();
                System.out.println("Query numbers: ");
                int q = s.nextInt();
                s.nextLine();
                for (int k = 0; k < q; k++) {
                    System.out.println("Next Command: ");
                    String x=s.nextLine();
                    if (x.equals("a"))
                        a(A);
                    else if (x.equals("b"))
                        b(A);
                    else if (x.equals("c"))
                        c(A);
                    else if (x.equals("d"))
                        d(A);
                    else if (x.equals("e"))
                        e(A);
                    else if (x.equals("f"))
                        f(A);

                }
            }

        }
    }

    private static void a(ArrayList A) {
        System.out.println("Element to add: ");
        A.add(sc.nextInt());
    }

    private static void b(ArrayList A) {
        Collections.sort(A);
    }

    private static void c(ArrayList A) {

        Collections.reverse(A);
    }

    private static void d(ArrayList A) {

        System.out.println(A.size());
    }

    private static void e(ArrayList A) {
        for (int j = 0; j < A.size(); j++) {
            System.out.println(A.get(j) + " ");
            A.trimToSize();
        }
    }

    private static void f(ArrayList A) {
        Collections.sort(A, Collections.reverseOrder());
    }
}


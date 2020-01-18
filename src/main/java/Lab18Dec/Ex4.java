package Lab18Dec;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Test numbers: ");
        int t = s.nextInt();
        if (t <= 200 && t >= 1) {
            for (int i = 0; i < t; i++) {
                System.out.println(" Size of Array: ");
                int n = s.nextInt();
                s.nextLine();
                int[] a = new int[10000];
                for (int j = 0; j < n; j++) {
                    System.out.println("Enter number: ");
                    a[j] = s.nextInt();
                }
                for (int j = 0; j < n; j++)
                {
                    for (int k = 0; k < a.length - 1; k++) {
                            if (a[k] > a[k + 1]) {
                                int aux = a[k];
                                a[k] = a[k + 1];
                                a[k + 1] = aux;
                            }

                        }
                    }
                    for (int l = 0; l < n; l++)
                        System.out.println(a[l]);
                }
            }
        }
    }

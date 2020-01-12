package Making_Decisions;

import javax.naming.CompoundName;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Comparing_Numbers {
    private static ArrayList<Integer> x=new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b;
        System.out.println("How many number inputs do you want ?");
        int n=sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0;i<n;i++)
            a[i]=ninit(i+1);
        b=a[0];
        for(int i=0;i<n;i++)
            if(a[i]>b)
                b=a[i];
            else
                continue;
        System.out.println("Largest number is "+b);

    }
    private static int ninit(int i) {
        Scanner a = new Scanner(System.in);
        int b = 0;
        int ok=0;
        if (i <= 10) {
            switch (i) {
                case 1:
                    System.out.println("Enter first number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
                case 2:
                    System.out.println("Enter second number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
                case 3:
                    System.out.println("Enter third number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
                case 4:
                    System.out.println("Enter fourth number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
                case 5:
                    System.out.println("Enter fifth number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
                case 6:
                    System.out.println("Enter sixth number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
                case 7:
                    System.out.println("Enter seventh number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
                case 8:
                    System.out.println("Enter eighth number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
                case 9:
                    System.out.println("Enter nineth number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
                case 10:
                    System.out.println("Enter tenth number: ");
                    b = a.nextInt();
                    x.add(b);
                    break;
            }
        }
        else {
            System.out.println("Enter " + i + "th number: ");
            b = a.nextInt();
            x.add(b);
        }
        if(x.size()>0) {
            for (int j = 0; j < x.size(); j++) {
                if (b == x.get(j)) {
                    ok++;
                    if (ok > 1) {
                        System.out.println("This number has already been inputed");
                        x.remove(j);
                        ninit(i);
                    }
                }
            }
        }
            return b;
        }
    }

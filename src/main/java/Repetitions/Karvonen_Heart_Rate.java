package Repetitions;

import java.util.Scanner;

public class Karvonen_Heart_Rate {
    private static int age;
    private static int rHr;
    public static void main(String[] args) {
        init();
        THR(age,rHr);
    }
    private static void init()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("What is your age ?");
        age=s.nextInt();
        System.out.println("What is your resting heart rate ?");
        rHr=s.nextInt();
    }
    private static void THR(int a,int b)
    {
        System.out.println("Intensity               | Rate");
        System.out.println("------------------------------");
        int thr=0;
        for(int i=55;i<=95;i=i+10) {
            thr = (((220-a) - b) * i)/100 + b;
            System.out.println(i+"%                 | "+thr+" bmp");
        }
    }

}

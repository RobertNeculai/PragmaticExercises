package Repetitions;

import java.util.Scanner;

public class Adding_Numbers {
    private static int n;
    public static void main(String[] args) {
    Calc();
    }
    private static void Init()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("How many numbers do you want to input ?");
        n=s.nextInt();
    }
    private static void Calc(){
        Init();
        Scanner s=new Scanner(System.in);
        int a=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number : ");
            a=a+s.nextInt();
        }
        System.out.println("The total is : "+a);
    }
}

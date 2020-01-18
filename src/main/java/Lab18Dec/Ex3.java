package Lab18Dec;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Test numbers: ");
        int t = s.nextInt();
        if (t <= 200 && t >= 1) {
            for (int i = 0; i < t; i++) {
                int sumI=0;
                int sumP=0;
                System.out.println(" numbers: ");
                int n = s.nextInt();
                s.nextLine();
                for (int k = 0; k <= n; k++) {

                    if(k%2==0)
                        sumP+=k;
                    else
                        sumI+=k;
                }
                System.out.println(sumP+" "+sumI);

                }
            }
    }
}

package Calculations;
import java.util.Scanner;
public class Self_Checkout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of items: ");
        int n=scanner.nextInt();
        double s=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Price of item " + (i + 1) + " : ");
            double a = scanner.nextDouble();
            System.out.println("Quantity of item " + (i + 1) + " : ");
            int q = scanner.nextInt();
            for (int c = 0; c < q; c++)
                s = s + a;
        }
        double t=(s*5.5)/100;
        System.out.println("Subtotal: "+s+"\n"+"Taxes: "+t+"\n"+"Total: "+(s+t));
    }
}


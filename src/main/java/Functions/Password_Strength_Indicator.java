package Functions;

import java.util.Scanner;
public class Password_Strength_Indicator {
    public static void main(String[] args) {
        String a = passInit();
        passwordValidator(a);

    }

    private static String passInit() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter password: ");
        String a = sc1.nextLine();
        return a;
    }

    private static int letterCheck(String a) {
        int ok = 0;
        if (a.matches("(?=.*[a-z,A-Z]).*"))
            ok = 1;
        return ok;
    }

    private static int numberCheck(String a) {
        int ok = 0;
        if (a.matches("(?=.*[0-9]).*"))
            ok = 1;
        return ok;
    }

    private static int specialCheck(String a) {
        int ok = 0;
        if (a.matches(".*([~!@#$%^&*()_-]).*"))
            ok = 1;
        return ok;
    }

    private static int lenghtChecker(String a) {
        int value;
        if (a.length() >= 8) {
            value = 1;
            return value;
        } else {
            value = 0;
            return value;
        }
    }

    private static void passwordValidator(String a) {
        if (lenghtChecker(a) == 0) {
            if (numberCheck(a) == 1 && letterCheck(a) != 1 && specialCheck(a) != 1)
                System.out.println("Password is very weak");
            else if (numberCheck(a) == 1 || letterCheck(a) == 1 && specialCheck(a) != 1)
                System.out.println("Password is weak");
            else if (numberCheck(a) == 1 && letterCheck(a) == 1 && specialCheck(a) != 1)
                System.out.println("Password is weak");
        } else {
            if (numberCheck(a) == 1 && letterCheck(a) == 1 && specialCheck(a) != 1)
                System.out.println("Password is strong");
            else if (numberCheck(a) == 1 && letterCheck(a) == 1 && specialCheck(a) == 1)
                System.out.println("Password is very strong");
        }
    }
}
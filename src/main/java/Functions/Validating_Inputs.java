package Functions;

import java.util.Scanner;

public class Validating_Inputs {
    public static String FN, LN, Eid, zip;

    public static void main(String[] args) {
        Init();
        Validator(FN,LN,zip,Eid);

    }

    public static void Init() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name: ");
        FN = s.nextLine();
        System.out.println("Enter last name: ");
        LN = s.nextLine();
        System.out.println("Enter zip code: ");
        zip = s.nextLine();
        System.out.println("Enter employee ID: ");
        Eid = s.nextLine();
    }

    private static int Fn_Validator(String a) {
        if (a != null && a.length() > 1)
            return 1;
        else {
            System.out.println("First name must be filled and be atleast 2 characters");
            return 0;
        }
    }

    private static int Ln_Validator(String a) {
        if (a != null && a.length() > 1)
            return 1;
        else {
            System.out.println("Last name must be filled and be atleast 2 characters");
            return 0;
        }
    }

    private static int zip_Validator(String a) {
        if (a != null && a.matches("(?=.*[0-9]).*"))
            return 1;
        else {
            System.out.println("Zip code must be numerical");
            return 0;
        }
    }

    private static int Eid_Validator(String a) {
        if (a != null && a.matches("[A-Za-z]{2}[-]{1}(.*)[0-9]{4}"))
            return 1;
        else {
            System.out.println("Employee ID must start with 2 letters and have 4 numeric digits");
            return 0;
        }
    }

    public static void Validator(String a, String b, String c, String d) {
        if (Fn_Validator(a) == 1 && Ln_Validator(b) == 1 && zip_Validator(c) == 1 && Eid_Validator(d) == 1)
            System.out.println("No errors found");
        else
            System.out.println("Errors encountered");
    }
}

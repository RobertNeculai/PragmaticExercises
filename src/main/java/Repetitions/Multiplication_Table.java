package Repetitions;

public class Multiplication_Table {
    public static void main(String[] args) {
        M_table();
    }
    private static void M_table()
    {
        for(int i=0;i<13;i++)
            for(int j=0;j<13;j++)
            {
                System.out.println(i+" x "+j+" = "+(i*j));
            }
    }
}

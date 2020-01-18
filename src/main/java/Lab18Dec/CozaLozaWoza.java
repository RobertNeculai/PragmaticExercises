package Lab18Dec;

import java.util.ArrayList;

public class CozaLozaWoza {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 110; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                list.add("CozaLoza");
           else if(i % 3 == 0 && i % 7 == 0)
                list.add("CozaWoza");
           else if (i % 3 == 0&& i%5!=0)
                list.add("Coza");
           else  if (i % 5 == 0)
                list.add("Loza");
            else if (i % 7 == 0&& i%3!=0)
                list.add("Woza");
                    else
                    list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i % 11 == 0)
                System.out.println();
            System.out.print(" "+list.get(i));

        }
    }
}

package WorkingWithFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Name_Sorter {
    private static String filePath = "C:\\Users\\Robi\\Desktop\\ListOfNames.txt";
    private static String filepathOut = "C:\\Users\\Robi\\Desktop\\NameSorting.txt";
    private static BufferedWriter writer;

    static {
        try {
            writer = new BufferedWriter(new FileWriter(filepathOut));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        init();
        writer.close();
    }

    public static void init() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        List<String> a=new ArrayList<>();
        while ((line = reader.readLine()) != null) {
                    a.add(line);
        }
        Collections.sort(a);
        for(String d:a) {
            writer.write(d + " ");
            writer.newLine();
        }

        System.out.println();
        reader.close();
    }
}

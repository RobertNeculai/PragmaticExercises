package DataStructures;

import java.util.*;

public class FilteringRecords {

    private static List<Map<String, Object>> records = new ArrayList<>();
    private static List<Map<String, Object>> recordsSearched = new ArrayList<>();
    private static String search;

    public static void main(String[] args) {
        init();
        searchInit();
        filteringRecords();
        sortingRecordsByLastName();

    }
    public static void searchInit(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a search string: ");
        search=s.nextLine();
    }
    public static void init() {
        Map<String, Object> row1 = new LinkedHashMap<>();
        Map<String, Object> row2 = new LinkedHashMap<>();
        Map<String, Object> row3 = new LinkedHashMap<>();
        Map<String, Object> row4 = new LinkedHashMap<>();
        Map<String, Object> row5 = new LinkedHashMap<>();
        Map<String, Object> row6 = new LinkedHashMap<>();

        row1.put("firstName", "John");
        row1.put("lastName", "Johnson");
        row1.put("position", "Manager");
        row1.put("separtion-date", "2016-12-31");

        row2.put("firstName", "Tou");
        row2.put("lastName", "Xiong");
        row2.put("position", "Software Engineer");
        row2.put("separtion-date", "2016-10-05");

        row3.put("firstName", "Michaela");
        row3.put("lastName", "Michaelson");
        row3.put("position", "District Manager");
        row3.put("separtion-date", "2015-12-19");

        row4.put("firstName", "Jake");
        row4.put("lastName", "Jacobson");
        row4.put("position", "Programmer");
        row4.put("separtion-date", "");

        row5.put("firstName", "Jacquelyn");
        row5.put("lastName", "Jackson");
        row5.put("position", "DBA");
        row5.put("separtion-date", "");

        row6.put("firstName", "Sally");
        row6.put("lastName", "Weber");
        row6.put("position", "Web Developer");
        row6.put("separtion-date", "2015-12-18");

        records.add(row1);
        records.add(row2);
        records.add(row3);
        records.add(row4);
        records.add(row5);
        records.add(row6);
    }
    private static void filteringRecords() {
        for (Map<String, Object> sortedMap : records) {
            for (Map.Entry<String, Object> currentMapIterator : sortedMap.entrySet()) {
                if (currentMapIterator.getKey().equals("lastName")) {
                    if(currentMapIterator.getValue().toString().contains(search))
                        recordsSearched.add(sortedMap);

                }
            }
        }
    }
                private static void sortingRecordsByLastName () {

                    recordsSearched.sort(Comparator.comparing(recordsSearched -> recordsSearched.get("lastName").toString()));

                    System.out.println("Name                 | Position             | Separation Date       |");
                    System.out.println("-------------------------------------------------------------------");
                    for (Map<String, Object> sortedMap : recordsSearched) {
                        Iterator<Map.Entry<String, Object>> iterator = sortedMap.entrySet().iterator();
                        while (iterator.hasNext()) {
                            Map.Entry<String, Object> currentMapIterator = iterator.next();
                            if (currentMapIterator.getKey().equals("firstName")) {
                                currentMapIterator.setValue(currentMapIterator.getValue().toString() + " " +
                                        iterator.next().getValue().toString());
                            }
                            System.out.format("%-20s|\t", currentMapIterator.getValue());
                        }
                        System.out.println();
                    }

                }
            }

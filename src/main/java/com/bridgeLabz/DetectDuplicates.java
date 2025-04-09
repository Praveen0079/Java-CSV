package com.bridgeLabz;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) {
        String file = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\employee.csv";

        Set<String> uniqueIds = new HashSet<>();
        List<String[]> duplicateRecords = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] header = reader.readNext(); // Read and store header
            String[] line;

            while ((line = reader.readNext()) != null) {
                String id = line[0];

                if (!uniqueIds.add(id)) { // this only adds unique IDs and if user id exists We can enter this statement

                    duplicateRecords.add(line);
                }
            }

            if (duplicateRecords.isEmpty()) {
                System.out.println("No duplicate records found.");
            } else {
                System.out.println(" Duplicate records found:\n");
                System.out.printf("%-5s %-15s %-15s %-10s%n", header[0], header[1], header[2], header[3]);


                for (String[] record : duplicateRecords) {
                    System.out.printf("%-5s %-15s %-15s %-10s%n", record[0], record[1], record[2], record[3]);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
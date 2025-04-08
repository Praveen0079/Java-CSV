package com.bridgeLabz;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Scanner;

public class SearchRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String file = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\employee.csv";
        try(CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] line;
            line = reader.readNext();
            System.out.printf("%-5s %10s%n",line[2],line[3]);

            while ((line = reader.readNext())!=null){
//                System.out.println(line[2]+" "+line[3]);
                if(line[1].equals(name)) {
                    System.out.printf("%-5s %8s",line[2],line[3]);
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

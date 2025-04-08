package com.bridgeLabz;

import com.opencsv.CSVReader;

import javax.swing.*;
import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) {
        String file = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\students.csv";
        try(CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] line;
            line =reader.readNext();
            System.out.println(line[0]+" "+line[1]+" "+line[2]);

            while ((line = reader.readNext())!=null){
                if(Integer.parseInt(line[2])>=80){ // casting string to interger
                    System.out.println(line[0]+" "+line[1]+" "+line[2]);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

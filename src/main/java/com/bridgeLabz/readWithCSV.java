package com.bridgeLabz;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class readWithCSV {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\book1.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            while ((line=reader.readNext())!=null){
                System.out.println(line[0]+" "+line[1]);
            }
        }
        catch (Exception e){
            e.printStackTrace(); 
        }
    }

}

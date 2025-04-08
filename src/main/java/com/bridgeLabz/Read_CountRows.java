package com.bridgeLabz;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class Read_CountRows {
    public static void main(String[] args) {
        String file = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\book1.csv";
        try(CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] line;
            int count =-1; 
            while ((line = reader.readNext())!= null){
                System.out.println(line[0]+"  "+line[1]);
                count++;
            }
            System.out.println("Number of Lines excluding header : "+count);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

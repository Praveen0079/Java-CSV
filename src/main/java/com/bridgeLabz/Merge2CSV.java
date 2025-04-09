package com.bridgeLabz;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.commons.text.translate.CsvTranslators;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Merge2CSV {
    public static void main(String[] args) throws Exception {
        Map<String,String[]> studentInfo = new LinkedHashMap<>();
        String file = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\students.csv";
        String file2 = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\students2.csv";
        String merged = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\MergedFile.csv";

        try(CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] Line;
            Line = reader.readNext(); //skip header
            while ((Line=reader.readNext())!=null){
                String id = Line[0];
                String name = Line[1];
                String marks = Line[2];
                studentInfo.put(id,new String[]{name,marks});
            }
        }
        try(CSVReader reader = new CSVReader(new FileReader(file2));
            CSVWriter writer = new CSVWriter(new FileWriter(merged))) {
            String[] header = {"ID","Name","Marks","Age","Grades"}; //custom header
            String[] Line;
            Line = reader.readNext(); //skipping header again
            writer.writeNext(header);
            while ((Line=reader.readNext())!=null){
                String id = Line[0];
                String age = Line[1];
                String grade = Line[2];

                if(studentInfo.containsKey(id)){
                    String[] info = studentInfo.get(id);
                        writer.writeNext(new String[]{id,info[0],info[1],age,grade});
                }
            }
        }
        System.out.println("File Merged");
    }
}

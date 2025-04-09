package com.bridgeLabz;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class ValidateCSVData {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\email-number.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            String regexMail = "^[A-Za-z0-9+_.-]+@[A-Za-z]+[.][a-z]{2,3}$";
            String regexNumber = "^\\d{10}$";
            String[] header = reader.readNext();
            while ((line=reader.readNext())!=null){
                if((!line[1].matches(regexMail)) && !(line[2].matches(regexNumber))){
                    System.out.printf("%-15s\n",line[0]+" : Incorrect Mail and Number");
                } else if (!line[1].matches(regexMail)) {
                    System.out.printf("%-15s\n",line[0]+" : Incorrect Mail");
                } else if (line[2].matches(regexNumber)) {
                    System.out.printf("%-15s \n",line[0]+" : Incorrect Number");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

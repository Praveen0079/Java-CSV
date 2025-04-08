package com.bridgeLabz;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader; 
import java.io.FileWriter;

public class ModifySalaries {
    public static void main(String[] args) {

        String file = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\employee.csv";
        String file1 = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\UpdatedEmployee.csv";

        try(CSVReader reader = new CSVReader(new FileReader(file));
            CSVWriter writer = new CSVWriter(new FileWriter(file1))
        ) {
            String[] line;
//            line = reader.readNext();
//            System.out.println(line[2]+" "+line[3]);

            while ((line = reader.readNext())!=null){
                        if(line[2].equals("IT")) {
                            double salary = Double.parseDouble(line[3]);
                            salary += salary * 0.1;
                            line[3] = String.valueOf(salary);
                        }
                        writer.writeNext(line);
                        // printing in better readable format
                System.out.printf("%-5s| %-15s | %-15s | %-10s %n", line[0], line[1], line[2], line[3]);

            }
        }catch (Exception e){

            e.printStackTrace();
        }
    }
}

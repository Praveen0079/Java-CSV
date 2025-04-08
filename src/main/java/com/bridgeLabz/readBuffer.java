package com.bridgeLabz;
import java.io.*;

public class readBuffer {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\employee.csv";
        String filePath1 = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\book1.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String Line;
            while ((Line = br.readLine()) != null){
                String[] row = Line.split(",");

//          System.out.println( "ID : "+row[0]+" Name : "+row[1]+" | Department : "+row[2]+" | Salary : "+row[3]);
                
                for (String i : row){
                    System.out.printf("%-15s",i);
                }
                System.out.println();

            }
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }
}

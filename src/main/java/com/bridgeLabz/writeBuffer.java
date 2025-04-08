package com.bridgeLabz;

import java.io.*;

public class writeBuffer {
    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\CSV-data\\src\\main\\java\\com\\bridgeLabz\\output.csv";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write("ID,Name,Department\n");
            writer.write("101,Tony,avengers\n");
            writer.write("104,Mark,Viltromite\n");
            writer.write("102,Bruce,DC\n");
            writer.write("106,Flash,JL\n");
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){ 
            String line;
            while ((line = reader.readLine())!= null){
                String[] row = line.split(",");
                for (String index : row){
                    System.out.printf("%-10s",index);
                }
                System.out.println();
            }
        }
    }
}

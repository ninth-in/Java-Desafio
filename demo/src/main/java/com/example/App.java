package com.example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        String line = "";
        int aux = 0;
        int[][] res = new int[3][10];
        try {
            BufferedReader br = new BufferedReader(new FileReader("Dados-Pedro/source/products_shuffled.csv"));
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                if(values[0].equals("0001")){
                    aux = aux + 1; 
                }
                
                //else if(values[0].equals("0002")){
                //    aux = aux + 1;
                //}
            }
            
            System.out.println(res);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String[]> csvData = createCsvDataSimple();
    
        try (CSVWriter writer = new CSVWriter(new FileWriter("Dados-Pedro/source/total.csv"))) {
            writer.writeAll(csvData);
            }
        }
        
        private static List<String[]> createCsvDataSimple() {
            String[] header = {"id", "name", "address", "phone"};
            String[] record1 = {"1", "first name", "address 1", "11111"};
            String[] record2 = {"2", "second name", "address 2", "22222"};
        
            List<String[]> list = new ArrayList<>();
            list.add(header);
            list.add(record1);
            list.add(record2);
        
            return list;
        }
        
}


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
                //else if(values[0].equals("0003")){
                //    aux = aux + 1;
                //}
                //else if(values[0].equals("0004")){
                //    aux = aux + 1;
                //}
                //else if(values[0].equals("0005")){
                //    aux = aux + 1;
                //}
                //else if(values[0].equals("0006")){
                //    aux = aux + 1;
                //}
                //else if(values[0].equals("0007")){
                //    aux = aux + 1;
                //}
                //else if(values[0].equals("0008")){
                //    aux = aux + 1;
                //}
                //else if(values[0].equals("0009")){
                //    aux = aux + 1;
                //}
                //else if(values[0].equals("00010")){
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
            String[] header = {"Code", "Product", "Description", "Total"};
            String[] record1 = {"0001", "Brown rice", "xxx"}; //vai ficar grande demais - arrumar um jeito automatico?
            String[] record2 = {"0002", "Milk", "xxx"};
            String[] record3 = {"0003", "Extra virgin olive oil", "xxx"};
            String[] record4 = {"0004", "Watermelon", "xxx"};
            String[] record5 = {"0005", "Barbecue sauce", "xxx"};
            String[] record6 = {"0006", "Lemon", "xxx"};
            String[] record7 = {"0007", "Chocolate", "xxx"};
            String[] record8 = {"0008", "Soda", "xxx"};
            String[] record9 = {"0009", "Tea", "xxx"};
            String[] record10 = {"00010", "Coffee", "xxx"};
        
            List<String[]> list = new ArrayList<>();
            list.add(header);
            list.add(record1);
            list.add(record2);
            list.add(record3);
            list.add(record4);
            list.add(record5);
            list.add(record6);
            list.add(record7);
            list.add(record8);
            list.add(record9);
            list.add(record10);
        
            return list;
        }
        
}


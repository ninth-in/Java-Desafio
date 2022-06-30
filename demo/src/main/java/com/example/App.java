package com.example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import com.opencsv.CSVWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class App 
{
    //primeira parte
    public static void cont() throws IOException{
        long start = System.currentTimeMillis();
        CSVWriter csvWriter = new CSVWriter(new FileWriter("demo/example.csv"));
        List<String[]> rows = new LinkedList<String[]>();
        String line = "";
        int aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8, aux9, aux10;
        aux1 = aux2 = aux3 = aux4 = aux5 = aux6 = aux7 = aux8 = aux9 = aux10 = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Dados-Pedro/source/products_shuffled.csv"));
            while((line = br.readLine()) != null){

                String[] values = line.split(",");
                if(values[0].equals("0001")){
                    aux1 += 1; 
                }
                else if(values[0].equals("0002")){
                    aux2 += 1;
                }
                else if(values[0].equals("0003")){
                    aux3 += 1;
                }
                else if(values[0].equals("0004")){
                    aux4 += 1;
                }
                else if(values[0].equals("0005")){
                    aux5 += 1;
                }
                else if(values[0].equals("0006")){
                    aux6 += 1;
                }
                else if(values[0].equals("0007")){
                    aux7 += 1;
                }
                else if(values[0].equals("0008")){
                    aux8 += 1;
                }
                else if(values[0].equals("0009")){
                    aux9 += 1;
                }
                else if(values[0].equals("0010")){
                    aux10 += 1;
                }
            }
            rows.add(new String[]{"0001", "Brown rice", "xxx", Integer.toString(aux1)});
            rows.add(new String[]{"0002", "Milk", "xxx", Integer.toString(aux2)});
            rows.add(new String[]{"0003", "Extra virgin olive oil", "xxx", Integer.toString(aux3)});
            rows.add(new String[]{"0004", "Watermelon", "xxx", Integer.toString(aux4)});
            rows.add(new String[]{"0005", "Barbecue sauce", "xxx", Integer.toString(aux5)});
            rows.add(new String[]{"0006", "Lemon", "xxx", Integer.toString(aux6)});
            rows.add(new String[]{"0007", "Chocolate", "xxx", Integer.toString(aux7)});
            rows.add(new String[]{"0008", "Soda", "xxx", Integer.toString(aux8)});
            rows.add(new String[]{"0009", "Tea", "xxx", Integer.toString(aux9)});
            rows.add(new String[]{"00010", "Coffee", "xxx", Integer.toString(aux10)});
            csvWriter.writeAll(rows);
            long end = System.currentTimeMillis();
            NumberFormat formatter = new DecimalFormat("#0.00000");
            System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        csvWriter.close();
        
    }

    //segunda parte
    public static void lote() throws IOException{
        long start = System.currentTimeMillis();
        List<List<String>> llp = new ArrayList<List<String>>();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Dados-Pedro/source/products_shuffled.csv"));
            while((line = br.readLine()) != null){

                llp.add(Arrays.asList(line.split(",")));
               
            }
            llp.sort(new Comparator<List<String>>() {
                @Override
                public int compare(List<String> o1, List<String> o2) {
                    return o1.get(1).compareTo(o2.get(1));
                }
            });
            System.out.println(llp);
            long end = System.currentTimeMillis();
            NumberFormat formatter = new DecimalFormat("#0.00000");
            System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //terceira parte

    //main
    public static void main( String[] args ) throws IOException{
        //cont();
        lote();
    }
    
}


package com.example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.io.IOException;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        String line = "";
        int aux = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Dados-Pedro/source/products_shuffled.csv"));
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                if(values[0] == "0001"){
                    aux = aux + 1; 
                }
                
            }
            System.out.println(aux);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

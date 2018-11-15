package com.company.CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        File csvFile = new File("src/com/company/CSV/data.csv");
        ArrayList<String> fromCsv = new ArrayList<>();
        String line = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile));
             Scanner sc = new Scanner(line)) {
            sc.useDelimiter(",");

            while ((line = reader.readLine()) != null) {
                while (sc.hasNext()) {
                    fromCsv.add(sc.next());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : fromCsv) {
            System.out.print(s);
            System.out.println(" läst");
        }

    }
}

package com.company.CSV;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        File csvFile = new File("src/com/company/CSV/data.csv");
        ArrayList<String> fromCsv = new ArrayList<>();

        try (Scanner sc = new Scanner(csvFile).useDelimiter(",")) {
            System.out.println("file initiated");
                while (sc.hasNextLine()) {
                    System.out.println("found token");
                    fromCsv.add(sc.next());
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

package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main1 {

    public static void main(String[] args) {
        //createFile();
        deleteFiles();
        //writeToFiles();
    }

    public static void createFile() {
        int n = 0;
        for (int i = 0; i <= 999; i++) {
            n = n + 1;
            File file = new File("file" + n + ".txt");
            try {
                if (file.createNewFile()) {
                    System.out.println("File created");
                } else {
                    System.out.println("Not Created");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteFiles() {
        int n = 0;
        for (int i = 0; i <= 999; i++) {
            n = n + 1;
            File file = new File("file" + n + ".txt");
            if (file.delete()) {
                System.out.println("Deleted");
            } else {
                System.out.println("Not deleted");
            }
        }
    }

    public static void writeToFiles() {
        int n = 0;
        int m = 0;
        for (int i = 0; i <= 999; i++) {
            n = n + 1;
            m = n + 1;
            String s = Integer.toString(m);
            try {
                FileWriter file = new FileWriter("file" + n + ".txt");
                file.write(s);
                file.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
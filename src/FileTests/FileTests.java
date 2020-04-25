package FileTests;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileTests {
    public void createFile() {
        File file = new File("langs.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("OK");
            } else {
                System.out.println("Error");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter("langs.txt");
            fileWriter.write("java\npython\nphp\njavascrip\ngo\nkotlin\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        try {
            Scanner scanner = new Scanner(new File("langs.txt"));
            while (scanner.hasNext()) {
                String s = scanner.next();
                System.out.print(s + ", ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void readAndSort() {
        ArrayList<String> langs = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(new File("langs.txt"));
            while (scanner.hasNext()) {
                String s = scanner.next();
                System.out.print(s + ", ");
                langs.add(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(langs);
        System.out.println(langs);
    }
    public void deleteFile() {
        System.out.print("File name: ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
            System.out.println("Deleted");
        }else {
            System.out.println("File doesnt exist");
        }
    }

    public void insertToNotesFromFile() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "root");

            Statement stmt = con.createStatement();

            Scanner scanner = new Scanner(new File("langs.txt"));

            int id = 4;
            while (scanner.hasNext()) {
                String s = scanner.next();
//                System.out.print(s + ", ");
                stmt.executeUpdate("insert into notes values ("+id+", '"+s+"')");
                id++;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("ok");
        }
    }
}

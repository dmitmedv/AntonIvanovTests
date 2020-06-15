package FileTests;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
        } else {
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
                stmt.executeUpdate("insert into notes values (" + id + ", '" + s + "')");
                id++;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("ok");
        }
    }

    public static void hashMapTest1() {
        HashMap<String, String> brandCountry = new HashMap<String, String>();
        brandCountry.put("Apple", "US");
        brandCountry.put("Toyota", "Japan");
        brandCountry.put("AK-47", "Russia");
        brandCountry.put("Adidas", "Germany");
        System.out.println(brandCountry);
        System.out.println(brandCountry.get("Adidas"));
        System.out.println(brandCountry.size());
        System.out.println("\n");
        //brandCountry.clear();
        //System.out.println(brandCountry);
        System.out.println("VALUES:");
        for (
                String i : brandCountry.values())

        {
            System.out.println(i);
        }
        System.out.println("\n");
        for (
                String i : brandCountry.keySet())

        {
            System.out.println("KEY:" + i + " " + "VALUE:" + brandCountry.get(i));
        }
    }

    public static void hashMapTest2() {
        HashMap<String, Integer> currency = new HashMap<String, Integer>();
        currency.put("Gold", 200);
        currency.put("Dollar", 35);
        currency.put("Euro", 45);
        for (String i : currency.keySet()) {
            System.out.println("KEY: " + i + " " + "VALUE: " + currency.get(i));
        }
    }

}

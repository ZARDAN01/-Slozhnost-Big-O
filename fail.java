package com;

import java.io.*;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.C;

public class fail {
    public static void main(String[] args) throws IOException {

        String new_path = "C://Users//Asus//IdeaProjects//Slo//src//com/experiment1.java";
        BufferedReader inputStream = new BufferedReader(new FileReader(
                "C://Users//Asus//IdeaProjects//Slo//src//com/experiment1.java"));
        File UIFile = new File("Slozhnost.txt");
        // if File doesnt exists, then create it
        if (!UIFile.exists()) {
            UIFile.createNewFile();
        }
        FileWriter filewriter = new FileWriter(UIFile.getAbsoluteFile());
        BufferedWriter outputStream = new BufferedWriter(filewriter);
        String count;
        while ((count = inputStream.readLine()) != null) {
            outputStream.write(count);
            System.out.println(count);
        }
        outputStream.flush();
        outputStream.close();
        inputStream.close();
    }
}
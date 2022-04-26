package com.example.week88;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("name the file");
            String file = sc.next();
            File ffile = new File(file);
            PrintWriter pw = new PrintWriter(ffile);
            int i = 1;
            while (i < 100) {
                pw.print((int) (Math.random() * 100) + " ");
                i++;
            }
            pw.close();
        }
        catch (Exception e){
            System.out.println("this is error");
        }
    }
}
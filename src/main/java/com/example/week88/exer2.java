package com.example.week88;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("name the file");
            String file = sc.next();
            File ffile = new File(file);
            FileOutputStream p = new FileOutputStream(ffile);
            for(int i = 1; i<100; i++){
                p.write((int)(Math.random() * 100));
            }
            p.close();
        }
        catch (Exception e){
            System.out.println("this is error");
        }
    }
}
package com.harman.assess;

import org.w3c.dom.ls.LSOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Createfile {
    public static void main(String[] args) {
        try{
        String a ;
        Scanner input = new Scanner(System.in);
        FileOutputStream newObj = new FileOutputStream("Assess.txt");
        a = "HAPPY NEW YEAR";
        byte b[] = a.getBytes();
        newObj.write(b);
        newObj.close();
        System.out.println("File Created");
    }catch (IOException e){
            System.out.println(e);
        }
    }
}

package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Reading wordlist...\nenter word");
        Scanner a = new Scanner(System.in);
        String word1 = a.nextLine();

        SpellCheck word = new SpellCheck(word1);
        System.out.println(word.binarySearch(word1));
    }
}

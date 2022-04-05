package com.company;

import java.io.*;
import java.util.Arrays;

public class SpellCheck {

    public static final int listsize = 150000;
    private String[] words;
    private int numwords = 0;
    private String key;

    public SpellCheck(String key) throws IOException {
        words = new String[listsize];
        this.key = key;
        this.getArray();
    }

    public void getArray() throws IOException {
        FileReader fr = new FileReader("spellcheck.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine())!= null) {
           words[numwords] = line;
           numwords++;
        }
    }

    public String binarySearch(String key){
        int left = 0;
        int right = listsize - 1;

        while(left<=right){
            int halfway = (left+right)/2;
            if(words[halfway].equals(key))
                return key + " is spelled correctly!";

            else if(words[halfway].compareTo(key)<0)
                left = halfway + 1;
            else
                right = halfway - 1;
        }
        return key + " is spelled correctly!";
    }

}

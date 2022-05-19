package com.wordle;
import java.io.*;
import java.util.ArrayList;


public class Words {
    ArrayList<String> getWords()  {
       ArrayList<String> wordsList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Arjun\\Programming\\wordle\\resources\\sgb-words.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                wordsList.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return wordsList;
    }

}

package com.wordle;
import java.io.*;
import java.util.ArrayList;


public class Words {
    ArrayList<String> getWords()  {
       ArrayList<String> wordsList = new ArrayList<>();

       //Get relative File Path
        String filePath = new File("").getAbsolutePath();
        String path = filePath.concat("\\resources\\sgb-words.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line = reader.readLine()) != null) {
                wordsList.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsList;
    }

}

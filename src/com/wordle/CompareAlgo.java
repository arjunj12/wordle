package com.wordle;

import java.util.ArrayList;

public class CompareAlgo {

    ArrayList<Integer> correctPosition = new ArrayList<>();
    ArrayList<Integer> wrongPosition = new ArrayList<>();
    String guessWord;

    public boolean game(String sw, String gw) {

        guessWord = gw;
        boolean[] solutionLetters = new boolean[26];

        // input into map
        for(int i = 0; i < sw.length(); i++)
            solutionLetters[sw.charAt(i) - 'a'] = true;

        //correct and wrong Position
        for(int i = 0; i < gw.length(); i++){
            if(gw.charAt(i) == sw.charAt(i)){
                correctPosition.add(i);
            }
            else if(solutionLetters[gw.charAt(i) - 'a']) {
                wrongPosition.add(i);
            }
        }

        return sw.equals(gw) ? true : false;
    }

    public void displayWord(){

        //Colors
        final String GREEN = "\033[1;92m"; //green
        final String YELLOW = "\033[1;93m"; // yellow
        final String RESET = "\033[0m"; //Text Reset


        for(int i=0;i< guessWord.length();i++){
            if(correctPosition.contains(i)){
                System.out.print(Colors.GREEN + guessWord.charAt(i) + Colors.RESET );
            }
            else if(wrongPosition.contains((i))){
                System.out.print(Colors.YELLOW + guessWord.charAt(i) + Colors.RESET );
            }
            else {
                System.out.print(guessWord.charAt(i));
            }
        }
        System.out.println();
    }
}

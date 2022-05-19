package com.wordle;

import java.util.ArrayList;

public class CompareAlgo {

    ArrayList<Integer> correctPosition = new ArrayList<>();
    ArrayList<Integer> wrongPosition = new ArrayList<>();
    ArrayList<Character> guessWord = new ArrayList<>();

    public boolean game(String sw, String gw) {

        ArrayList<Character> solutionWord = new ArrayList<>();
        for(char ch : gw.toCharArray()) {
            guessWord.add(ch);
        }

        for(char ch : sw.toCharArray()) {
            solutionWord.add(ch);
        }

        //correct Position
        for(int i=0;i<guessWord.size();i++){
            if(guessWord.get(i) == solutionWord.get(i)){
                correctPosition.add(i);
            }
        }

        //wrong position
        for(int i=0;i<guessWord.size();i++){
            for(int j = 0;j<solutionWord.size();j++){
                if(i != j){
                    if(guessWord.get(i) == solutionWord.get(j)){
                        wrongPosition.add(i);
                    }
                }
            }
        }

        return sw.equals(gw) ? true : false;
    }

    public void displayWord(){

        //Colors
        final String GREEN = "\033[1;92m"; //green
        final String YELLOW = "\033[1;93m"; // yellow
        final String RESET = "\033[0m"; //Text Reset


        for(int i=0;i< guessWord.size();i++){
            if(correctPosition.contains(i)){
                System.out.print(Colors.GREEN + guessWord.get(i) + Colors.RESET );
            }
            else if(wrongPosition.contains((i))){
                System.out.print(Colors.YELLOW + guessWord.get(i) + Colors.RESET );
            }
            else {
                System.out.print(guessWord.get(i) );
            }
        }
        System.out.println();
    }
}

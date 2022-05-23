package com.wordle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> wordsList = new ArrayList<>();
        OutputDisplay display = new OutputDisplay();

        Words w = new Words();
        wordsList = w.getWords();

        //random word Generator
        int index = (int) (Math.random() * wordsList.size());
        String solutionWord = wordsList.get(index);

        display.outputIntro();

        int i = 0;
        Boolean correctGuess = false;
        while(i<6){
            CompareAlgo algo = new CompareAlgo();

            //Input Guess Word
            System.out.print("Enter Guess " + (i+1) + " :" );
            Scanner sc = new Scanner(System.in);
            String guessWord = sc.nextLine();

            //Guess Word validity check
            AuthenticateInput input = new AuthenticateInput();
            boolean validity = input.verifyInput(guessWord);

            if(validity){
                correctGuess = algo.game(solutionWord,guessWord);
                algo.displayWord();
                i++;
                if(correctGuess)
                    break;
            }

            else {
                System.out.println("Not In Word List");
            }
        }

       display.outputConclusion(correctGuess,solutionWord);

    }
}

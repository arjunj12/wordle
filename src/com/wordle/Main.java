package com.wordle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> wordsList = new ArrayList<>();

        Words w = new Words();
        wordsList = w.getWords();

        //random word Generator
        int index = (int) (Math.random() * wordsList.size());
        String solutionWord = wordsList.get(index);
        System.out.println(solutionWord);

        int i = 0;
        Boolean correctGuess = false;
        while(i<6){
            CompareAlgo algo = new CompareAlgo();

            //Input Guess Word
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
                System.out.println("Invalid Input");
            }
        }

        if(correctGuess){
            System.out.println("Congrats!! Your Guess Is correct");
        }
        else{
            System.out.println();
            System.out.println("Your Guess is Over!!..The Correct Word is " + solutionWord);
        }

    }
}

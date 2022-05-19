package com.wordle;

import java.util.ArrayList;

public class AuthenticateInput {

    public boolean verifyInput(String guessWord) {
        if(guessWord.length() != 5) return false;

        ArrayList<String> wordsList = new ArrayList<>();
        Words w = new Words();
        wordsList = w.getWords();

        if(!wordsList.contains(guessWord)) return false;

        return true;
    }
}

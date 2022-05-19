package com.wordle;

public class OutputDisplay {
    void outputIntro(){
        //Menu Screen Printing
        System.out.println(Colors.BLUE + "Welcome To Wordle Tutorial" + Colors.RESET);
        System.out.println(Colors.GREEN + "Green color" +  Colors.RESET + " for letter in Correct Position");
        System.out.println(Colors.YELLOW + "Yellow color" + Colors.RESET + " for letter in Wrong Position");
        System.out.println("Grey color for letter not in any spot" );
        System.out.println();
    }

    //End Page Printing
    void outputConclusion(boolean correctGuess,String solutionWord){
        if(correctGuess){
            System.out.println("Congrats!! Your Guess Is correct");
        }
        else{
            System.out.println();
            System.out.println("Your Guess is Over!!..The Correct Word is " + Colors.GREEN + solutionWord + Colors.RESET);
        }
    }
}

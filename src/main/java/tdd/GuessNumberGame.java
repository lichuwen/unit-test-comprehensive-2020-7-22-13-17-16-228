package tdd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class GuessNumberGame {
    public String guess(String guessNumber,String answer){
        String rightOutput = "";
        int countA=0, countB=0;
        int guessIndex,answerIndex;

        ArrayList<Character> answerList = new ArrayList<>();
        ArrayList<Character> guessList = new ArrayList<>();

        for(int i=0; i<guessNumber.length(); i++){
            guessList.add(guessNumber.charAt(i));
            answerList.add(answer.charAt(i));
        }

        for(int i=0; i<guessNumber.length(); i++){
            if(answerList.contains(guessList.get(i))){
                guessIndex = guessList.indexOf(guessList.get(i));
                answerIndex = answerList.indexOf(guessList.get(i));
                if(guessIndex == answerIndex){
                    countA++;
                }
                else{
                    countB++;
                }
            }
        }
        rightOutput = countA + "A" + countB + "B";
        return rightOutput;
    }

    public String verifyGuessNumber(String guessNumber){
        String input = "";
        HashSet<Character> randomGuess = new HashSet<Character>();
        for(int i=0; i<guessNumber.length(); i++){
            randomGuess.add(guessNumber.charAt(i));
        }
        if(randomGuess.size()<4){
            input = "Wrong Input，Input again";
        }
        return input;
    }

}

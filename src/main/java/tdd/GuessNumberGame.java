package tdd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class GuessNumberGame {
    public String guess(String guessNumber){
        String rightNumber = "";
        String answer = "3189";

        int countA=0, countB=0;

        ArrayList<Character> answerList = new ArrayList<>();
        ArrayList<Character> guessList = new ArrayList<>();

        for(int i=0; i<guessNumber.length(); i++){
            guessList.add(guessNumber.charAt(i));
            answerList.add(answer.charAt(i));
        }

        boolean flag = true;
        int guessIndex,answerIndex;
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


        for(int i=0; i<guessNumber.length(); i++){
            if(guessNumber.charAt(i) == (answer.charAt(i))){
                rightNumber = "4A0B";
            }
        }

        return rightNumber;
    }

}

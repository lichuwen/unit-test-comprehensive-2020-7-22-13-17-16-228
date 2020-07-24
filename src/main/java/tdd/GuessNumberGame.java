package tdd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class GuessNumberGame {
    private String answer;

    GuessNumberGame(String answer) {
        this.answer = answer;
    }

    String guess(String guessNumber) {
        String rightOutput = "";
        int countA = 0, countB = 0;
        int guessIndex, answerIndex;

        ArrayList<Character> answerList = new ArrayList<>();
        ArrayList<Character> guessList = new ArrayList<>();

        for (int i = 0; i < guessNumber.length(); i++) {
            guessList.add(guessNumber.charAt(i));
            answerList.add(answer.charAt(i));
        }

        for (int i = 0; i < guessNumber.length(); i++) {
            if (answerList.contains(guessList.get(i))) {
                guessIndex = guessList.indexOf(guessList.get(i));
                answerIndex = answerList.indexOf(guessList.get(i));
                if (guessIndex == answerIndex) {
                    countA++;
                } else {
                    countB++;
                }
            }
        }
        rightOutput = countA + "A" + countB + "B";
        return rightOutput;
    }
}

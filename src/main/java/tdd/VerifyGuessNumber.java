package tdd;

import java.util.HashSet;

public class VerifyGuessNumber {
    String verifyGuessNumber(String guessNumber) {
        String input = "";
        HashSet<Character> randomGuess = new HashSet<Character>();
        for (int i = 0; i < guessNumber.length(); i++) {
            randomGuess.add(guessNumber.charAt(i));
        }
        if (randomGuess.size() < 4) {
            input = "Wrong Input,Input again";
        }
        return input;
    }
}

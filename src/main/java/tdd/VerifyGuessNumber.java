package tdd;

import java.util.HashSet;

public class VerifyGuessNumber {
    String verifyGuessNumber(String guessNumber) {
        String input = "";
        HashSet<Character> randomGuess = new HashSet<>();
        for (int num = 0; num < guessNumber.length(); num++) {
            randomGuess.add(guessNumber.charAt(num));
        }
        if (randomGuess.size() < 4) {
            input = "Wrong Input,Input again";
        }
        return input;
    }
}

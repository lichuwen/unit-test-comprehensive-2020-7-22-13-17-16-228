package tdd;

import java.util.HashSet;

public class RandomAnswerGeneratorImpl implements RandomAnswerGenerator {
    @Override
    public String generateRandomAnswer() {
        String str = "0123456789";
        HashSet<Character> randomGuess = new HashSet<>();
        for (int i = 0; randomGuess.size() < 4; i++) {
            randomGuess.add(str.charAt((int) (Math.random() * 9)));
        }
        StringBuilder randomNum = new StringBuilder();
        for (Character num:randomGuess){
            randomNum.append(num);
        }
        return randomNum.toString();
    }
}

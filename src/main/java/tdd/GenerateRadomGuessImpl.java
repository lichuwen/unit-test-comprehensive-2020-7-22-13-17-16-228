package tdd;

import java.util.HashSet;
import java.util.Iterator;

public class GenerateRadomGuessImpl implements GenerateRadomGuess{
    @Override
    public String generateRadomNumber() {
        String str = "0123456789";
        HashSet<Character> randomGuess = new HashSet<Character>();
        for (int i = 0; randomGuess.size() < 4; i++) {
            randomGuess.add(str.charAt((int) (Math.random() * 9)));
        }
        String randomNum = "";
        Iterator it = randomGuess.iterator();
        while(it.hasNext()){
            randomNum += it.next();
        }
        return randomNum;
    }
}

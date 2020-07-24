package tdd;

import java.util.HashSet;

// todo modify class name 16-19
public class RadomAnswerGeneratorImpl implements RadomAnswerGenerator {
    @Override
    public String generateRadomAnswer() {
        String str = "0123456789";
        HashSet<Character> randomGuess = new HashSet<Character>();
        for (int i = 0; randomGuess.size() < 4; i++) {
            randomGuess.add(str.charAt((int) (Math.random() * 9)));
        }
        String randomNum = "";
//        Iterator it = randomGuess.iterator();
//        while(it.hasNext()){
//            randomNum += it.next();
//        }
        for (Character num:randomGuess){
            randomNum += num;
        }
        return randomNum;
    }
}

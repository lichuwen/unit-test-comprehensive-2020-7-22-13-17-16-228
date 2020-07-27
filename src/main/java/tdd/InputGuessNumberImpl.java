package tdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputGuessNumberImpl implements InputGuessNumber{
    @Override
    public String getGuessNumber() throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = stdin.readLine();
        String[] guessNumbers = inputNumber.split(" ");
        StringBuilder guessNumber = new StringBuilder();
        for(String s:guessNumbers){
            guessNumber.append(s);
        }
        return guessNumber.toString();
    }
}

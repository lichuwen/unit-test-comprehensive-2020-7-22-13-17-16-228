package tdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputGuessNumberImpl implements InputGuessNumber{
    @Override
    public void getGuessNumber() throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = stdin.readLine();
        String guessNumbers[] = inputNumber.split(" ");
        String guessNumber = "";
        for(String s:guessNumbers){
            guessNumber += s;
        }
    }

    @Override
    public void gameProcess() throws IOException {
        for(int i=0; i<6; i++){
            this.getGuessNumber();
        }
    }
}

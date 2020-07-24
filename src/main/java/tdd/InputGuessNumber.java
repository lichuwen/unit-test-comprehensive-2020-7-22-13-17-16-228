package tdd;

import java.io.IOException;

public interface InputGuessNumber {
    String getGuessNumber() throws IOException;
    void gameProcess() throws IOException;
}

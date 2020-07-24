package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerifyGuessNumberTest {
    @Test
    void should_return_wrong_message_when_guess_1234_given_input_12(){
        //given
        String guessNumber = "12";
        VerifyGuessNumber verifyGuess = new VerifyGuessNumber();

        //when
        String actual = verifyGuess.verifyGuessNumber(guessNumber);

        //then
        Assertions.assertEquals("Wrong Input,Input again", actual);

    }

    @Test
    void should_return_wrong_message_when_guess_1234_given_input_1223(){
        //given
        String guessNumber = "1223";
        VerifyGuessNumber verifyGuess = new VerifyGuessNumber();

        //when
        String actual = verifyGuess.verifyGuessNumber(guessNumber);

        //then
        Assertions.assertEquals("Wrong Input,Input again", actual);

    }
}

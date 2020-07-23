package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_1234_given_input_1234(){
        //given
        String guessNumber = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame();

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("4A0B",actual);

    }


}

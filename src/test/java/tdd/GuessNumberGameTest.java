package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234(){
        //given
        String answer = "1234";
        String guessNumber = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("4A0B",actual);

    }

    @Test
    void should_return_0A0B_when_guess_5678_given_input_1234(){
        //given
        String answer = "1234";
        String guessNumber = "5678";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A0B",actual);

    }

    @Test
    void should_return_0A2B_when_guess_2156_given_input_1234(){
        //given
        String answer = "1234";
        String guessNumber = "2156";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A2B",actual);

    }

    @Test
    void should_return_0A4B_when_guess_3412_given_input_1234(){
        //given
        String answer = "1234";
        String guessNumber = "3412";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A4B",actual);

    }

}

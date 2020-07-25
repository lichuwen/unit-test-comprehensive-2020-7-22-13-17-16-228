package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234(){
        //given
        RadomAnswerGenerator mockradomAnswerGenerator = Mockito.mock(RadomAnswerGenerator.class);
        given(mockradomAnswerGenerator.generateRadomAnswer()).willReturn("1234");

        String guessNumber = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockradomAnswerGenerator.generateRadomAnswer());

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("4A0B",actual);

    }

    @Test
    void should_return_0A0B_when_guess_5678_given_input_1234(){
        //given
        RadomAnswerGenerator mockradomAnswerGenerator = Mockito.mock(RadomAnswerGenerator.class);
        given(mockradomAnswerGenerator.generateRadomAnswer()).willReturn("1234");

        String guessNumber = "5678";
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockradomAnswerGenerator.generateRadomAnswer());

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A0B",actual);

    }

    @Test
    void should_return_0A2B_when_guess_2156_given_input_1234(){
        //given
        RadomAnswerGenerator mockradomAnswerGenerator = Mockito.mock(RadomAnswerGenerator.class);
        given(mockradomAnswerGenerator.generateRadomAnswer()).willReturn("1234");

        String guessNumber = "2156";
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockradomAnswerGenerator.generateRadomAnswer());

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A2B",actual);

    }

    @Test
    void should_return_0A4B_when_guess_3412_given_input_1234(){
        //given
        RadomAnswerGenerator mockradomAnswerGenerator = Mockito.mock(RadomAnswerGenerator.class);
        given(mockradomAnswerGenerator.generateRadomAnswer()).willReturn("1234");

        String guessNumber = "3412";
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockradomAnswerGenerator.generateRadomAnswer());

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A4B",actual);

    }

    @Test
    void should_return_2A2B_when_guess_1243_given_input_1234(){
        //given
        RadomAnswerGenerator mockradomAnswerGenerator = Mockito.mock(RadomAnswerGenerator.class);
        given(mockradomAnswerGenerator.generateRadomAnswer()).willReturn("1234");

        String guessNumber = "1243";
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockradomAnswerGenerator.generateRadomAnswer());

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("2A2B",actual);

    }

    @Test
    void should_return_1A1B_when_guess_1563_given_input_1234(){
        //given
        RadomAnswerGenerator mockradomAnswerGenerator = Mockito.mock(RadomAnswerGenerator.class);
        given(mockradomAnswerGenerator.generateRadomAnswer()).willReturn("1234");

        String guessNumber = "1563";
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockradomAnswerGenerator.generateRadomAnswer());

        //when
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("1A1B",actual);

    }

}

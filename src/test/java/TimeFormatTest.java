import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeFormatTest {

    @BeforeEach
    void setUp() {
    }


    @Test
    void testingForCorrectFormatHoursAndMinutes(){
        Assertions.assertTrue(TimeFormat.IsTimeValid("12:30"));
    }

    @Test
    void testingForInvalidMinute(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("12:65"));
    }

    @Test
    void testingForInvalidHour(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("26:30"));
    }

    @Test
    void testingForIncorrectHourFormat(){Assertions.assertFalse(TimeFormat.IsTimeValid("123:30"));}

    @Test
    void testingForIncorrectMinuteFormat(){Assertions.assertFalse(TimeFormat.IsTimeValid("12:300"));}

    @Test
    void testingForSmallHourFormat(){Assertions.assertFalse(TimeFormat.IsTimeValid("1:30"));}

    @Test
    void testingForSmallMinuteFormat(){Assertions.assertFalse(TimeFormat.IsTimeValid("14:2"));}

    @Test
    void testingForInvalidCharacter(){
            Assertions.assertFalse(TimeFormat.IsTimeValid("12:30!"));
    }

    @Test
    void testingForDecimalInHour(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("12.5:30"));
    }

    @Test
    void testingForDecimalInMinute(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("12:30.6"));
    }

    @Test
    void testingForSeconds(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("12:30:45"));
    }

}
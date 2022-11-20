import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class TimeFormatTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Testing Correct format | true")
    void testingForCorrectFormat(){
        Assertions.assertTrue(TimeFormat.IsTimeValid("12:30"));
    }

    @Test
    @DisplayName("Testing for nonexistent minute | false")
    void testingForNonexistentMinute(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("12:65"));
    }

    @Test
    @DisplayName("Testing for nonexistent hour | false")
    void testingForNonexistentHour(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("26:30"));
    }

    @Test
    @DisplayName("Testing for too many hour numbers | false")
    void testingForLargeHourFormat(){Assertions.assertFalse(TimeFormat.IsTimeValid("123:30"));}

    @Test
    @DisplayName("Testing for too many minute numbers | false")
    void testingForLargeMinuteFormat(){Assertions.assertFalse(TimeFormat.IsTimeValid("12:300"));}

    @Test
    @DisplayName("Testing for not enough hour numbers | false")
    void testingForSmallHourFormat(){Assertions.assertFalse(TimeFormat.IsTimeValid("1:30"));}

    @Test
    @DisplayName("Testing for not enough minute numbers | false")
    void testingForSmallMinuteFormat(){Assertions.assertFalse(TimeFormat.IsTimeValid("14:2"));}

    @Test
    @DisplayName("Testing for an invalid character | false")
    void testingForInvalidCharacter(){Assertions.assertFalse(TimeFormat.IsTimeValid("12:30!"));}

    @Test
    @DisplayName("Testing for a decimal number for hour | false")
    void testingForDecimalInHour(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("12.5:30"));
    }

    @Test
    @DisplayName("Testing for a decimal number for minute | false")
    void testingForDecimalInMinute(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("12:30.6"));
    }

    @Test
    @DisplayName("Testing for seconds | false")
    void testingForSeconds(){
        Assertions.assertFalse(TimeFormat.IsTimeValid("12:30:45"));
    }

    @Test
    @DisplayName("Testing for 24:00 as midnight | false") // range goes from 00 to 23 NOT 24
    void testingIncorrect24Clock(){Assertions.assertFalse(TimeFormat.IsTimeValid("24:00"));}

    @Test
    @DisplayName("Testing for 00:00 as midnight | true")
    void testingCorrectClock2(){Assertions.assertTrue(TimeFormat.IsTimeValid("00:00"));}

    @Test
    void testingnull(){Assertions.assertFalse(TimeFormat.IsTimeValid(""));}
}


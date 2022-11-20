import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class TimeFormatTest {

    TimeFormat timeFormat;

    @BeforeEach
    void setUp() {
        timeFormat = new TimeFormat();
    }

    @Test
    @DisplayName("Testing Correct format | true")
    void testingForCorrectFormat(){
        assertTrue(timeFormat.IsTimeValid("12:30"));
    }

    @Test
    @DisplayName("Testing for nonexistent minute | false")
    void testingForNonexistentMinute(){
        assertFalse(timeFormat.IsTimeValid("12:65"));
    }

    @Test
    @DisplayName("Testing for nonexistent hour | false")
    void testingForNonexistentHour(){ assertFalse(timeFormat.IsTimeValid("26:30"));
    }

    @Test
    @DisplayName("Testing for too many hour numbers | false")
    void testingForLargeHourFormat(){assertFalse(timeFormat.IsTimeValid("123:30"));}

    @Test
    @DisplayName("Testing for too many minute numbers | false")
    void testingForLargeMinuteFormat(){assertFalse(timeFormat.IsTimeValid("12:300"));}

    @Test
    @DisplayName("Testing for not enough hour numbers | false")
    void testingForSmallHourFormat(){assertFalse(timeFormat.IsTimeValid("1:30"));}

    @Test
    @DisplayName("Testing for not enough minute numbers | false")
    void testingForSmallMinuteFormat(){assertFalse(timeFormat.IsTimeValid("14:2"));}

    @Test
    @DisplayName("Testing for an invalid character | false")
    void testingForInvalidCharacter(){assertFalse(timeFormat.IsTimeValid("12:30!"));}

    @Test
    @DisplayName("Testing for a decimal number for hour | false")
    void testingForDecimalInHour(){
        assertFalse(timeFormat.IsTimeValid("12.5:30"));
    }

    @Test
    @DisplayName("Testing for a decimal number for minute | false")
    void testingForDecimalInMinute(){
        assertFalse(timeFormat.IsTimeValid("12:30.6"));
    }

    @Test
    @DisplayName("Testing for seconds | false")
    void testingForSeconds(){
        assertFalse(timeFormat.IsTimeValid("12:30:45"));
    }

    @Test
    @DisplayName("Testing for 24:00 as midnight | false") // range goes from 00 to 23 NOT 24
    void testingIncorrect24Clock(){assertFalse(timeFormat.IsTimeValid("24:00"));}

    @Test
    @DisplayName("Testing for 00:00 as midnight | true")
    void testingCorrectClock2(){assertTrue(timeFormat.IsTimeValid("00:00"));}

    @Test
    void testingNull(){assertFalse(timeFormat.IsTimeValid(""));}
}


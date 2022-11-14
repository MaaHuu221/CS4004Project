import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTimeAndChoiceTest {

    MeetingTimeAndChoice overlapping;

    @BeforeEach
    void setUp() {
        overlapping = new MeetingTimeAndChoice();
    }

    @ParameterizedTest
    @CsvSource({"11:00 to 12:00,yes,true",
            "15:30 to 16:00,x,false,",
            "15:30 to 16:00,x,true",
            "11:00 to 12:00,no,false",
            "0,x,false"})
    void overlappingTime(String time, String choice, boolean expected) {
        ArrayList<String> times = new ArrayList<>(Arrays.asList("12:30 to 13:30", "15:30 to 16:00"));
        boolean result = overlapping.MeetingTimeAndChoice(times, time, choice);
        assertEquals(expected, result);


    }

    @Test
    void nullList(){
        ArrayList<String> times = new ArrayList<>();
        assertTrue(overlapping.MeetingTimeAndChoice(times, "11:00", "x"));
    }
}



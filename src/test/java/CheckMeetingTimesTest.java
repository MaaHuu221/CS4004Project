import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckMeetingTimesTest {

    CheckMeetingTimes overlapping;

    @BeforeEach
    void setUp() {
        overlapping = new CheckMeetingTimes();
    }

    @Test
    void overlappingTime() {
        ArrayList<String> times = new ArrayList<>(Arrays.asList("12:30", "2:00", "3:30", "5:00"));
        assertFalse(overlapping.CheckMeetingTimes(times, "5:00"));
    }

    @Test
    void noOverlappingTime(){
        ArrayList<String> times = new ArrayList<>(Arrays.asList("12:30", "2:00", "3:30", "5:00"));
        assertTrue(overlapping.CheckMeetingTimes(times, "11:00"));
    }


}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    @DisplayName("Overlapping time, expected false")
    void overlappingTime() {
        ArrayList<String> times = new ArrayList<>(Arrays.asList("12:30", "2:00", "3:30", "5:00"));
        assertFalse(overlapping.CheckMeetingTimes(times, "5:00"));
    }

    @Test
    @DisplayName("No Overlapping time, expected true")
    void noOverlappingTime() {
        ArrayList<String> times = new ArrayList<>(Arrays.asList("12:30", "2:00", "3:30", "5:00"));
        assertTrue(overlapping.CheckMeetingTimes(times, "11:00"));
    }

}




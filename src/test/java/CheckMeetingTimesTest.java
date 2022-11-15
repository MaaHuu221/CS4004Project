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
        // Creates arraylist of the times of meetings already scheduled
        ArrayList<String> times = new ArrayList<>(Arrays.asList("12:30", "2:00", "3:30", "5:00"));
        // returns false if new meeting time overlaps with any meeting time in the arraylist -> test should pass as the time DOES overlap
        assertFalse(overlapping.CheckMeetingTimes(times, "5:00"));
    }

    @Test
    @DisplayName("No Overlapping time, expected true")
    void noOverlappingTime(){
        // Creates arraylist of the times of meetings already scheduled
        ArrayList<String> times = new ArrayList<>(Arrays.asList("12:30", "2:00", "3:30", "5:00"));
        //returns true if new meeting time does not overlap with any meeting time in the arraylist -> test should pass as the time DOES NOT overlap
        assertTrue(overlapping.CheckMeetingTimes(times, "11:00"));
    }


}
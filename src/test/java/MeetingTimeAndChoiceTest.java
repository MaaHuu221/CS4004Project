import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

    @ParameterizedTest(name = "#{index} - Test with {0} and {1}, expect {2}")
    @CsvSource({"11:00 to 12:00,yes,true",
            "15:30 to 16:00,x,false,",
            "15:30 to 16:00,x,true",
            "11:00 to 12:00,no,false",
            "0,x,false"})
    void overlappingTime(String time, String choice, boolean expected) {
        // Create Arraylist with the time of scheduled meetings
        ArrayList<String> times = new ArrayList<>(Arrays.asList("12:30 to 13:30", "15:30 to 16:00"));
        // Generate result with the array created with the other parameters provided
        boolean result = overlapping.MeetingTimeAndChoice(times, time, choice);
        // Compare this result with the expected result given -> test should pass if the result and expected result are equal
        assertEquals(expected, result);


    }

    @Test
    @DisplayName("Testing with empty/null arraylist")
    void nullList(){
        // Creating a null/empty arraylist (no meetings scheduled so no times)
        ArrayList<String> times = new ArrayList<>();
        // Use this arraylist and put in parameters -> test should always pass if the arraylist is empty
        assertTrue(overlapping.MeetingTimeAndChoice(times, "11:00", "x"));
    }
}



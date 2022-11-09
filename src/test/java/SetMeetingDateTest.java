import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMeetingDateTest {

    SetMeetingDate extendDateRange;

    @BeforeEach
    void setUp() {
       extendDateRange = new SetMeetingDate();
    }

    @Test
    void isDateValidTrue() {
        assertTrue(extendDateRange.validDate(2022, 12, 31));
    }

    @Test
    void isDateValidFail(){
        assertFalse(extendDateRange.validDate(2022, 12, 31));
    }



}

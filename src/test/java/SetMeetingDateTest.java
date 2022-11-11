import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMeetingDateTest {

    SetMeetingDate setMeetingDate;

    @BeforeEach
    void setUp() {
       setMeetingDate = new SetMeetingDate();
    }

    @Test
    void isDateValidTrue() {
        assertTrue(setMeetingDate.validDate(20229, 12, 31));
    }

    @Test
    void isDateValidFail(){
        assertFalse(setMeetingDate.validDate(2022, 12, 31));
    }



}

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
    void testForARealDay() {
        assertTrue(setMeetingDate.validDate(2022, 12, 31));
    }

    @Test
    void testToSeeIfDatePast2021(){
        assertFalse(setMeetingDate.validDate(2021, 12, 31));
    }


    @Test
    void testForANonExistentDate(){
        assertFalse(setMeetingDate.validDate(2022, 2, 31));
    }



}

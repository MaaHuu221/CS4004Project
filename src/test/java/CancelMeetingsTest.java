import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CancelMeetingsTest {

    CancelMeetings cancelMeetings;

    @BeforeEach
    void setUp() {
       cancelMeetings = new CancelMeetings();
    }

    @DisplayName("Remove existing meeting ")
    @Test
    void removeMeeting() {
        assertEquals("Meeting has been removed", cancelMeetings.removeMeeting("Meeting 1"));
    }

    @DisplayName("If the meeting does not exist return an error")
    @Test
    void ifMeetingDoesNotExist(){
        assertEquals("Meeting does not exist", cancelMeetings.removeMeeting("Meeting 7"));
    }
}
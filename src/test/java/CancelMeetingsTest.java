import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CancelMeetingsTest {

    CancelMeetings cancelMeetings;
    Meetings meetings = mock(Meetings.class);
    ArrayList<String> meetingsList = meetings.getMeetings();

    @BeforeEach
    void setUp() {
       cancelMeetings = new CancelMeetings(meetings);
    }

    @Test
    void removeMeeting() {
        when(meetings.getMeetings()).thenReturn(meetingsList);
        assertEquals("Meeting removed", cancelMeetings.removeMeeting("Meeting 1"));
    }

    @Test
    void ifMeetingDoesNotExist(){
        when(meetings.getMeetings()).thenReturn(meetingsList);
        assertEquals("Meeting does not exist", cancelMeetings.removeMeeting("Meeting 7"));
    }
}
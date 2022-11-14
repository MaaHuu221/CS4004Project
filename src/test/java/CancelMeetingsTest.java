import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CancelMeetingsTest {

    CancelMeetings cancelMeetings;
    Meetings meetings = mock(Meetings.class);

    @BeforeEach
    void setUp() {
       cancelMeetings = new CancelMeetings(meetings);
    }

    @Test
    void removeMeeting() {
        when(meetings.getMeetings()).thenReturn(meetings.getMeetings());
        assertEquals("Meeting removed", cancelMeetings.removeMeeting("Meeting 1"));
    }
}
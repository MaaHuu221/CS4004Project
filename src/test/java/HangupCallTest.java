import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangupCallTest {
    HangupCall hangupCall;

    @BeforeEach
    void setUp() {
        hangupCall = new HangupCall();
    }

    @Test
    void shouldHangUpCallFail() {
        assertTrue(hangupCall.leaveCall(true));
        //Boolean stillOnCall should be false if Boolean leave is true
        //Test should fail
    }
    @Test
    void shouldNotHangupCallFail() {
        assertFalse(hangupCall.leaveCall(false));
        //Boolean stillOnCall should be true if Boolean leave is false
        //Test should fail
    }
}
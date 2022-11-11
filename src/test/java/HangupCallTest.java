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
    void shouldHangUpCall() {
        assertFalse(hangupCall.leaveCall(false));
        //Boolean stillOnCall should be false is argument is true
    }

}
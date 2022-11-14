import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeclineInvitationTest {
    DeclineInvitation declineInvitation;
    @BeforeEach
    void setUp() {declineInvitation = new DeclineInvitation();}

    @Test
    void invitationAcceptedPass() throws InvalidStringException {
        assertEquals("Invitation accepted", declineInvitation.acceptOrDecline("accept"));
    }

    @Test
    void invitationDeclinedPass() throws InvalidStringException{
        assertEquals("Invitation declined", declineInvitation.acceptOrDecline("decline"));
    }

}
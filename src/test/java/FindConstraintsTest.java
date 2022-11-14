import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class FindConstraintsTest {
    FindConstraints findConstraints;

    @BeforeEach
    void setUp() {
        findConstraints = new FindConstraints();
    }

    @Test
    void proposedDate() {
        //Creating 5 GregorianCalendar objects - the set of proposed meeting times given by initiator.
        GregorianCalendar availableTimes1 = new GregorianCalendar(2022, 10, 21, 13, 00, 00);
        GregorianCalendar availableTimes2 = new GregorianCalendar(2022, 10, 23, 14, 30, 00);
        GregorianCalendar availableTimes3 = new GregorianCalendar(2022, 10, 25, 9, 00, 00);
        GregorianCalendar availableTimes4 = new GregorianCalendar(2022, 10, 27, 10, 45, 00);
        GregorianCalendar availableTimes5 = new GregorianCalendar(2022, 10, 30, 12, 00, 00);
        //Creating 3 GregorianCalendar objects - the times from the set of meeting times above that are unavailable for the participant.
        GregorianCalendar unavailableTimes1 = new GregorianCalendar(2022, 10, 21, 13, 00, 00);
        GregorianCalendar unavailableTimes2 = new GregorianCalendar(2022, 10, 25, 9, 00, 00);
        GregorianCalendar unavailableTimes3 = new GregorianCalendar(2022, 10, 30, 12, 00, 00);
        //Adding the initiator available times to an array.
        GregorianCalendar[] initiatorAvailableTimes = new GregorianCalendar[5];
        initiatorAvailableTimes[0] = availableTimes1;
        initiatorAvailableTimes[1] = availableTimes2;
        initiatorAvailableTimes[2] = availableTimes3;
        initiatorAvailableTimes[3] = availableTimes4;
        initiatorAvailableTimes[4] = availableTimes5;
        //Adding the participant unavailable times to an array.
        GregorianCalendar[] participantUnavailableTimesPass = new GregorianCalendar[3];
        participantUnavailableTimesPass[0] = unavailableTimes1;
        participantUnavailableTimesPass[1] = unavailableTimes2;
        participantUnavailableTimesPass[2] = unavailableTimes3;
        //As each element of participantUnavailableTimes are elements of initiatorAvailableTimes the test below should return false.
        //Each element of participantUnavailableTimes is a "proposed date" given by the initiator.
        assertFalse(findConstraints.notAProposedDate(initiatorAvailableTimes, participantUnavailableTimesPass));
    }

    @Test
    void notAProposedDate() {
        //Creating 5 GregorianCalendar objects - the set of proposed meeting times given by initiator.
        GregorianCalendar availableTimes1 = new GregorianCalendar(2022, 10, 21, 13, 00, 00);
        GregorianCalendar availableTimes2 = new GregorianCalendar(2022, 10, 23, 14, 30, 00);
        GregorianCalendar availableTimes3 = new GregorianCalendar(2022, 10, 25, 9, 00, 00);
        GregorianCalendar availableTimes4 = new GregorianCalendar(2022, 10, 27, 10, 45, 00);
        GregorianCalendar availableTimes5 = new GregorianCalendar(2022, 10, 30, 12, 00, 00);
        //Creating 2 more GregorianCalendar objects - participant unavailable times that were not proposed by the initiator.
        GregorianCalendar unproposedTimes1 = new GregorianCalendar(2022, 12, 25, 14, 00, 00);
        GregorianCalendar unproposedTimes2 = new GregorianCalendar(2023, 1, 1, 12, 00, 00);
        //Adding the initiator available times to an array.
        GregorianCalendar[] initiatorAvailableTimes = new GregorianCalendar[5];
        initiatorAvailableTimes[0] = availableTimes1;
        initiatorAvailableTimes[1] = availableTimes2;
        initiatorAvailableTimes[2] = availableTimes3;
        initiatorAvailableTimes[3] = availableTimes4;
        initiatorAvailableTimes[4] = availableTimes5;
        //Adding unproposed times to an array.
        GregorianCalendar[] participantUnproposedTimes = new GregorianCalendar[2];
        participantUnproposedTimes[0] = unproposedTimes1;
        participantUnproposedTimes[1] = unproposedTimes2;
        //As the dates unproposedTimes1 and unproposedTimes2 were not proposed by initiator, test should return true.
        assertTrue(findConstraints.notAProposedDate(initiatorAvailableTimes, participantUnproposedTimes));
    }
}
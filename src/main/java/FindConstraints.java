
import java.util.Arrays;
import java.util.GregorianCalendar;

public class FindConstraints {
    public boolean notAProposedDate(GregorianCalendar[] iAT, GregorianCalendar[] pUT) {
        boolean notAProposedDate= false;
        //The parameter "iAT" stands for "initiator available times" - the times the initiator provides that they are available for.
        //The parameter "pUT" stands for "participant unavailable times" - a subset of the iAT in which the participant is unavailable.
        if (Arrays.asList(iAT).containsAll(Arrays.asList(pUT))) {
            notAProposedDate = false;
        } else {
            notAProposedDate = true;
        }
        return notAProposedDate;
    }
}

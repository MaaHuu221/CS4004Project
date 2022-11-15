import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ParticipantNameTest {

    ParticipantName participantName;

    @BeforeEach
    void setUp() {

        participantName = new ParticipantName();
    }

    @ParameterizedTest(name = "#{index} - Test with {0}, expect {2}")
    @CsvSource({"CaoimheCahill,true",
            "caoimhecahill,true",
            "CaOiMhEcAhIlL,true",
            "CAOIMHECAHILL,true",
            "CaoimheCahill1,false",
            "Caoimhe.Cahill, false",
            "CaimheCahil,false",})
    void name(String name, boolean expected){
        boolean result = participantName.ParticipantName(name);
        assertEquals(expected, result);
    }


}
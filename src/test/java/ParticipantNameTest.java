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
    @CsvSource({"CaoimheCahill,Found",
            "caoimhecahill,Found",
            "CaOiMhEcAhIlL,Found",
            "CAOIMHECAHILL,Found",
            "CaoimheCahill1,Not Found ",
            "Caoimhe.Cahill,Not Found",
            "CaimheCahil,Not Found",
            "Caoimhe Cahill,Not Found"})
    void name(String name, String expected){
        String result = participantName.ParticipantName(name);
        assertEquals(expected, result);
    }


}


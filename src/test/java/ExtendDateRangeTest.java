import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtendDateRangeTest {

    ExtendDateRange extendDateRange;

    @BeforeEach
    void setUp() {
       extendDateRange = new ExtendDateRange();
    }

    @Test
    void dateCheckerIfOver31S() {
        assertTrue(extendDateRange.validDate(2022, 12, 31));
    }

    @Test
    void dateCheckerIfOver31F(){
        assertFalse(extendDateRange.validDate(2022, 12, 31));
    }



}

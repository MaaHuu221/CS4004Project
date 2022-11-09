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
        assertEquals("Valid", extendDateRange.isValidDate(31, 12, 2022));
    }

    @Test
    void dateCheckerIfOver31F(){
        assertEquals("Valid", extendDateRange.isValidDate(35, 12, 2022) );
    }



}

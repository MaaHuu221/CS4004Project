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
    void dateCheckerIfOver31() {
        assertEquals("Invalid Date", extendDateRange.isValidDate(32, 12, 2022));
    }
}
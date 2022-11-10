import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationPickerTest {

    LocationPicker locationPicker;
    @BeforeEach
    void setUp() {
        locationPicker = new LocationPicker();
    }

    @Test
    void chooseLocation() {
       // assertEquals("Room " + locationPicker + " chosen!", locationPicker.chooseLocation(1));
    }
}
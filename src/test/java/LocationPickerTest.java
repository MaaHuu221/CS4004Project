import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class
LocationPickerTest {

    LocationPicker locationPicker;
    @BeforeEach
    void setUp() {
        locationPicker = new LocationPicker();
    }

    @Test
    void correctPlaceAndAvailablity() {
       assertEquals("Room " + 1 + " has been booked", locationPicker.chooseLocation(1, true));
    }

    @Test
    void unexistingRoom(){
        assertEquals("Room does not exist", locationPicker.chooseLocation(100, true));
    }

    @Test
    void unavailableRoom(){
        assertEquals("Room unavailable", locationPicker.chooseLocation(56, false));
    }

    @Test
    void unexistingAndUnavailableRoom() {
        assertEquals("Room does not exist", locationPicker.chooseLocation(100, false));
    }
}
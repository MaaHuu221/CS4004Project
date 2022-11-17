import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class
LocationPickerTest {

    LocationPicker locationPicker;
    @BeforeEach
    void setUp() {
        locationPicker = new LocationPicker();
    }


    //this test shows when a room exists and is available
    @DisplayName("Correct Place and Availability")
    @Test
    void correctPlaceAndAvailablity() {
       assertEquals("Room " + 1 + " has been booked", locationPicker.chooseLocation(1, true));
    }

    //this test will tell us if a room exists or not (i.e. is over 99 because in my head i only made 99 rooms >:))
    @DisplayName("If room does not exist")
    @Test
    void nonExistentRoom(){
        assertEquals("Room does not exist", locationPicker.chooseLocation(100, true));
    }

    //shows an existing room but one that is currently busy with another meeting
    @DisplayName("Unavailable Room")
    @Test
    void unavailableRoom(){
        assertEquals("Room unavailable", locationPicker.chooseLocation(56, false));
    }

    //a bit redundant but shows basically what happens if the room doesn't exist and is unavailable
    @DisplayName("Room doesn't exist and is not technically available")
    @Test
    void nonExistentAndUnavailableRoom() {
        assertEquals("Room does not exist", locationPicker.chooseLocation(100, false));
    }
}
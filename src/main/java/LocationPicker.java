import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Arrays;

public class LocationPicker {


    public String chooseLocation(int locationPicker, boolean availability){
        if ((locationPicker <= 99) && (availability)) {
            return "Room " + locationPicker + " has been booked";
        } else if ((locationPicker > 99) && (availability)) {
            return "Room does not exist";
        } else if ((!availability) && (locationPicker <= 99)){
            return "Room unavailable";
        }
        else return "Room does not exist";
    }
}

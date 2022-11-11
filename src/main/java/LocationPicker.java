import java.util.regex.Pattern;
import java.util.Arrays;

public class LocationPicker {


    public String chooseLocation(int locationPicker, boolean availability){
        if ((locationPicker <= 99) && (availability = true)) {
            return "Room " + " " + " has been booked";
        } else if ((locationPicker > 99)) {
            return "Room does notexist";
        } else if (availability = false){
            return "Room un available";
        }
        else return "Room doesnot exist";
    }

}

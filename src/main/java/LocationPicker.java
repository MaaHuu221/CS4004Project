import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Arrays;

public class LocationPicker {


    public String chooseLocation(int locationPicker, boolean availability){
        /* in my imaginary company there is only 99 rooms
        so basically if the room exists and is free
        the room gets booked
         */
        if ((locationPicker <= 99) && (availability)) {
            return "Room " + locationPicker + " has been booked";
            /*
            if the room doesn't exist (aka over 99 because that many rooms exist
            apparently) it will tell that to the user
             */
        } else if ((locationPicker > 99) && (availability)) {
            return "Room does not exist";
            /*
            then if the room does exist but is not available it tells the user
            to pick another
             */
        } else if ((!availability) && (locationPicker <= 99)){
            return "Room unavailable";
        }
        /* finally if both things are wrong,
        it will just tell the user the room doesn't exist and isn't available
         */
        else return "Room does not exist";
    }
}

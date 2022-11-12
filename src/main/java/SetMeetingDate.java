import java.time.DateTimeException;
import java.time.LocalDate;

public class SetMeetingDate {
    /*
    This method is used to see if an initiator can create a meeting on a valid
    an invalid date for example would be 30/02/2022
     */
    public boolean validDate(int year, int month, int day){
    try {
        LocalDate myDate = LocalDate.of(year, month, day);
        if (year < 2022) {
            System.out.println("Error: invalid date!");
            return false;
        }
        System.out.println(day + " " + month + " " + year + " selected! " );
        return true;
            /* if the date does not exist i.e 30/02/2022
            or the 30th of february any year for that matter :/
            */
    } catch (DateTimeException e) {
        System.out.println("Error: invalid date!");
        return false;
        }
    }
}

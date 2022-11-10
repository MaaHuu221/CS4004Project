import java.time.DateTimeException;
import java.time.LocalDate;

public class SetMeetingDate {

    public boolean validDate(int year, int month, int day){
        try {
            LocalDate myDate = LocalDate.of(year, month, day);
            System.out.println(day + " " + month + " " + year + " selected! " );
            return true;
        } catch (DateTimeException e) {
            System.out.println("Error: invalid date!");
             return false;
        }
    }
}

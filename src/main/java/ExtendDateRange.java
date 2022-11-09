import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class ExtendDateRange {

    public boolean validDate(int year, int month, int day){
        try {
            LocalDate myDate = LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}

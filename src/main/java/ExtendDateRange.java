import java.util.regex.Pattern;

public class ExtendDateRange {
    int[] monthsW31 = {1, 3, 5, 7, 8, 10, 12};
    int[] monthsW30 = {4,6,9,11};
    int[] monthsW29 = {2};
    public String isValidDate(int day, int month, int year) {
        if ((day >= 1 && day <= 31) && (month ==  ) && (year >= 2022)){
            return day + " " + month + " " + year;
        } else if ((day <= 30) && (month == ) && (year >= 2022)){
            return day + " " + month + " " + year;
        } else if ((day <= 29) && (month == ) && (year >= 2022))
    }
}

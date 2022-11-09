import java.util.regex.Pattern;

public class ExtendDateRange {
    int[] monthsW31 = {1, 3, 5, 7, 8, 10, 12};
    int[] monthsW30 = {4,6,9,11};
    int[] monthsW29 = {2};
    public String isValidDate(int day, int month, int year) {
        if ((day >= 1 && day <= 31) && (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12 ) && (year >= 2022)){
            return "Valid";
        } else if ((day >= 1 && day <= 30) && (month == 4 || month == 6 || month == 9 || month == 11 ) && (year >= 2022)){
            return "Valid";
        } else if ((day >= 1 && day <= 29) && (month == 2) && (year%4 == 0)){
            return "Valid";
        } else if ((day >= 1 && day <= 28) && (month == 2) && (year >= 2022)) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
}

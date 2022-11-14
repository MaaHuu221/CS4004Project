import java.util.regex.Pattern;

public class TimeFormat {

    public static final Pattern TIME_PATTERN = Pattern.compile(
            "(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]"
    );

    public static boolean IsTimeValid(CharSequence time) {
        return time != null && TIME_PATTERN.matcher(time).matches();
    }
}

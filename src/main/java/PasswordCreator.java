import java.util.regex.Pattern;

public class PasswordCreator {


    public static final Pattern PASSWORD_PATTERN = Pattern.compile(
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{10,25}$"
    );

    public static boolean isValidPassword(CharSequence password) {
        return password != null && PASSWORD_PATTERN.matcher(password).matches();
    }
}

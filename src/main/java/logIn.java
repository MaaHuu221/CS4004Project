import java.util.Scanner;

public class logIn {

    public boolean logIn(String actualUsername, String attemptedUsername, String actualPassword, String attemptedPassword) {
        if (actualUsername == attemptedUsername && actualPassword == attemptedPassword) {
            System.out.println("User has logged in successfully!");
            return true;
        } else {
            System.out.println("User has not logged in. Please try again.");
            return false;
        }
    }
}

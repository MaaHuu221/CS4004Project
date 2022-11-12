import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCreatorTest {

    /*
    coders note for myself password must contain
    - 1 or more lowercase
    - 1 or more uppercase
    - 1 or more special characters
    - 1 or more numbers
    - and between 10 and 25 characters
     */
    PasswordCreator passwordCreator;

    @BeforeEach
    void setUp() {
        passwordCreator = new PasswordCreator();
    }

    @Test
    void passwordWithLessThan10Characters() {
        assertFalse(PasswordCreator.isValidPassword("T3stP@ssw"));
    }

    @Test
    void passwordWithMoreThan25Characters(){
        assertFalse(PasswordCreator.isValidPassword("T3stP@sswordOver25Characters"));
    }

    @Test
    void passwordWithNoCaptitals(){
        assertFalse(PasswordCreator.isValidPassword("t3stp@sswordlower"));
    }

    @Test
    void passwordALLCAPS(){
        assertFalse(PasswordCreator.isValidPassword("T3STP@SSWORDUPPER"));
    }

    @Test
    void passwordWithNoSpecial(){
        assertFalse(PasswordCreator.isValidPassword("T3stPassword"));
    }

    @Test
    void passwordWithNoNumbers(){
        assertFalse(PasswordCreator.isValidPassword("TestP@ssword"));
    }

    @Test
    void workingPassword(){
        assertTrue(PasswordCreator.isValidPassword("T3stP@ssword"));
    }
}
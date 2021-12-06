package user;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User usr;

    @BeforeEach
    void setUp() {
        usr = User.builder()
                .name("Ostap")
                .secondName("Dutka")
                .age(18)
                .gender("male")
                .occupation("software dev")
                .occupation("designer")
                .weight(85)
                .build();
    }

    @Test
    void testToString() {
        String expRes = "User(name=Ostap, secondName=Dutka, gender=male, age=18, occupations=[software dev, designer], weight=85.0)";
        assertEquals(expRes, usr.toString());
    }
}
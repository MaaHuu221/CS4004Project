import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
@author Andy Whelan
 */

class NotificationSystemTest {

    NotificationSystem notificationSystem;

    @BeforeEach
    void setUp() { notificationSystem = new NotificationSystem();
    }

    @Test
    void notificationMorning() { assertEquals("Good morning! Time for your meetup with Friends!", notificationSystem.notificationType(9));
    }

    @Test
    void notificationAfternoon() { assertEquals("Afternoon! Ready to hangout with Colleagues?", notificationSystem.notificationType(14));
    }

    @Test
    void notificationEvening() { assertEquals("Good Evening! Meetup with Family is underway!", notificationSystem.notificationType(17));
    }

    @Test
    void notificationNight() { assertEquals("Late Night huh? The Bro-Zone Lair is waiting!", notificationSystem.notificationType(23));
    }
}
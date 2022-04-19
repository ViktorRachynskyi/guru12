package qa.guru;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupATests {

    @Test
    void aTest() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void aaTest() {
        assertTrue(true);
    }

    @Test
    void aaaTest() {
        assertTrue(false);
    }
}

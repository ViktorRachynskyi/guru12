package qa.guru;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupBTests {

    @Test
    void bTest() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void bbTest() {
        assertTrue(true);
    }

    @Test
    void bbbTest() {
        assertTrue(false);
    }
}

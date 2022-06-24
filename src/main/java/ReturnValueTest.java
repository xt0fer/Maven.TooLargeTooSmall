import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ReturnValueTest {

    @org.junit.jupiter.api.Test
    void testProcessName() {
        String result = ReturnValue.processName("foo");
        String expected = "FOO maybe you'll be a Zipcoder someday!\n";
        Assertions.assertEquals(expected, result);
    }
}
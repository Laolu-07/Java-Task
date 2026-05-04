import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfEachDigitTest {

    @Test
    public void testToCheckThatSumOfDigitExist(){
        int n = 999;
        int expectedValue = 27;
        int actualValue = SumOfEachDigit.SumOfDigit(n);
        assertEquals(expectedValue, actualValue);
    }
}


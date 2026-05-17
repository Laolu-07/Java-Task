import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStandardDeviation {

    @Test
    public void testMeanWithPositiveIntegers() {
            double[] nums = {1, 2, 3, 4, 5};
            double expected = 3.0;
            assertEquals(expected, MeanCalculator.mean(nums), 0.0001);
            
    }
}

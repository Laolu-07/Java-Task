import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Pentagonaltest{

    @Test
    public void testThatgetPentagonalNumber(){
    int number = 10;
    int expect = 156;
    int actual = Pentagonal.getpentagonalNumber(number);
    assertEquals(actual, expect);
    }
}


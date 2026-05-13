import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class TestOshoFreePromoEngine{
    
    @ Test
    public void testToCheckThatCartTotalIsLowerThan5000(){
        int cartTotal = 2500;
        String promoCode = "starter10";
        int expectedValue = 2500;
        int actualValue = OshoFreePromoEngine.OshoFree(cartTotal, promoCode);
        assertEquals(expectedValue, actualValue);
    }
}

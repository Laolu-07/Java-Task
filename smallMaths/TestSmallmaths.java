import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSmallmaths {

    @Test
    public void Testmultiplicationoftwonumbers (){
        double first = 4;
        double second = 5;
        double expectedvalue = 20;
        double actualvalue = Smallmaths.multiplication (first, second);
        assertEquals(expectedvalue, actualvalue);   
    }
    
    @Test
    public void Testnegativemultiplicationoftwonumbers (){
        double first = -4;
        double second = 5;
        double expectedvalue = -20;
        double actualvalue = Smallmaths.multiplication (first, second);
        assertEquals(expectedvalue, actualvalue);   
    }
    
     @Test
    public void Testsubstractionoftwonumbers (){
        double first = -4;
        double second = 5;
        double expectedvalue = 9;
        double actualvalue = Smallmaths.Substraction (first, second);
        assertEquals(expectedvalue, actualvalue);   
    }
     @Test
    public void Testadditionoftwonumbers (){
        double first = -4;
        double second = 5;
        double expectedvalue = 1;
        double actualvalue = Smallmaths.Addition (first, second);
        assertEquals(expectedvalue, actualvalue);   
    }
}


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    @Test
    public void test(){
    ReverseString rs=new ReverseString();
    int actualRes= rs.multiply(3,5);
    assertEquals(15,actualRes);
    
    }
}

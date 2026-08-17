import com.naveen.check.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ShapeTest2 {
    Shape obj=new Shape();
    @Test
    public void TestSquareArea(){
        assertNotEquals(56,obj.squareArea(24),()->"not Working");

    }
}

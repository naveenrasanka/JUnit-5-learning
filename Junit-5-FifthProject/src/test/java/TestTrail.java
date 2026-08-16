import com.naveen.check.Shape;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTrail {

    @Test
    public void test(){

        assertEquals(6,6);
    }
    @Test
    public void ShapeTest(){
        Shape shapeObj=new Shape();

       assertEquals(78.5,shapeObj.findAreaCircle(5));
    }
}

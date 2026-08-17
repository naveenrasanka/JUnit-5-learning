import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTesting {
    @Test
    public void testArray(){
        int exepected[]={3,4,5,6};
        int actual[]={4,3,5,6};

        Arrays.sort(actual); //3,4,5,6

        assertArrayEquals(exepected,actual);
        //assertEquals(exepected,actual); only check id not data
    }
}

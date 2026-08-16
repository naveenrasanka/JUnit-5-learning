import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testReverseString_OneWord(){
        Main obj=new Main();
        String result= obj.reverseString("Java");
        assertEquals("avaJ",result);


    }
   @Test
    public void testReverseString_MultipleWord(){
       Main obj=new Main();
       String result= obj.reverseString("Java is");
       assertEquals("si avaJ",result);
    }

}
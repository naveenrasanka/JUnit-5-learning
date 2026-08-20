import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayPerformance {

    @Test
    void testArrayPerformance(){
        SortingArray2 obj=new SortingArray2();
        int unsorted[]={3,1,2,6,5};

        assertTimeout(Duration.ofMillis(10),()->obj.sortArray(unsorted));
    }
}

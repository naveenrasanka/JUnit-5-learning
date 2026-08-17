import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class TestArray {
    @Test
    public void testArray(){

        try {
            SortingArray obj =new SortingArray();
            int ar[]={5,1,3,2};
            //int ar[]=null;
            int sortedArray[]= obj.sortArray(ar);

            for(int i:sortedArray){
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    void test(){
        int ar[]={5,1,3,2};
        //int ar[]=null;
        SortingArray obj =new SortingArray();
        assertThrows(NullPointerException.class,()->obj.sortArray(ar),"Not work");

    }
}

import course.JavaCourse;
import course.SpringBootCourse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import service.PurchaseCourse;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestPurchaseCourse {

    @Test
    public void testPurchaseCourse(){
        PurchaseCourse obj=new PurchaseCourse();
        //obj.proceedWithCourse(new SpringBootCourse());

        boolean result=obj.proceedWithCourse(new SpringBootCourse());

        assertTrue(result,()->"NOT WORK");      //Course course=new new SpringBootCourse();


    }

    @Test
    void testPurchaseCourse_false(){

        PurchaseCourse obj=new PurchaseCourse();
       Boolean result=obj.proceedWithCourse(new JavaCourse());

        assertFalse(result,()->"This is not work");
    }
}

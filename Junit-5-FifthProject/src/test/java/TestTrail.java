import com.naveen.check.Shape;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestTrail {

    TestTrail(){
        System.out.println("THIS IS CONSTRUCTOR");
    }
    @BeforeAll  //should be static if we dont use @TestInstance
    public static void beforeAll(){

        System.out.println("Before All !!!");
    }
    @AfterAll //should be static if we dont use @TestInstance
    public static void afterAll(){
        System.out.println("After All !!!");
    }
    @BeforeEach  //run first every test case first
    public void init(){
        Shape shapeObj=new Shape();
        assertEquals(78.5,shapeObj.findAreaCircle(5),()->"Test message!!");
        System.out.println("///Before Test");
    }
    @AfterEach
    public void Ainit(){
        System.out.println("///After Test clean");
    }
    @Test
    public void test(){

        assertEquals(6,6);
        System.out.println("1st test");
    }
    @Test
    public void ShapeTest(){
        Shape shapeObj=new Shape();

       assertEquals(78.5,shapeObj.findAreaCircle(5),"Not Working!!");
        System.out.println("Second Test");
    }
    @Test
    public void shapeTest_Supplire(){
        Shape shapeObj=new Shape();
      assertEquals(78.5,shapeObj.findAreaCircle(5),()->"Area is wrong!!");
        System.out.println("Third Test");
    }

}

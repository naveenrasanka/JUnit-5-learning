public class DemoFirstTest {
        public static void main(String[] args) {
            UnitTestFirst fistObj=new UnitTestFirst();

              int result1=fistObj.divide(10, 2);
              int result2=fistObj.multiply(20, 10);

              int expected=2;
            
              if (expected==result1) {
                System.out.println("test case is pass");
              }else{
                throw new ArithmeticException("Test is Fail");
              }
            System.out.println(result1);
            System.out.println(result2);
    }
}

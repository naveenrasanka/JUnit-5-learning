

class SingleTonTest{

   private static SingleTonTest obj=new SingleTonTest();

   private SingleTonTest(){

   }

   public static SingleTonTest getConnection(){

        return obj;
   }
   public void display(){
    System.out.println("Test");
   }

}
public class Singleton {
    
    public static void main(String[] args) {
        
        SingleTonTest sd=SingleTonTest.getConnection();
        sd.display();

    }


}

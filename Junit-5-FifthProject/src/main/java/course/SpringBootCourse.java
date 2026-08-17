package course;

public class SpringBootCourse implements Course {

    public  boolean coursePurchased(){
        System.out.println("SpringBoot Course purchased");
        return true;
    }
}

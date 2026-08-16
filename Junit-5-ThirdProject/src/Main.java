import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

public  String reverseString(String names){

        String  name=names;
        String spiltWord[]=name.split("");


            int len=0;

        int length=name.length();
        len=length;
        String Reverse[]=new String[length];
        for (int i=0;i<length;i++){

            Reverse[len-1]=spiltWord[i];
            len=len-1;
        }

    String result=String.join("",Reverse);
        return result;



/*        Main obj=new Main();
        obj.check();*/
    }
/*    public void check(){

        List<Integer> list=new ArrayList();
        list= Arrays.asList(2,3,4,5,10);

        List<Integer>st=list.stream()
                .filter(n->n%2==0)
                .toList();

        for (int i:st){
            System.out.println(i);
        }

    }*/
public static void main(String[] args) {
        Main obj=new Main();

    System.out.println(obj.reverseString("java"));

}
}
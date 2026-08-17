import java.util.Arrays;

public class SortingArray2 {

    public int[] sortArray(int []arr){

        for (int i=0;i<10000;i++){
            Arrays.sort(arr);
        }
        return arr;
    }
}

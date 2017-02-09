import java.util.Arrays;

/**
 * Created by matthew.wallace on 2/8/17.
 */
public class Main {


     Main() {
        int[] list = {4,67,78,3,7,10,100,234,254,233};
        int i,j, temp;

        System.out.println("unsorted list : " + Arrays.toString(list));

        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if(list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        System.out.println("sorted list : " + Arrays.toString(list));
    }


    public static void main(String[] args) {

        new Main();
    }
}
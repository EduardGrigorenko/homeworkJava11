import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;
        for (int i = 1; i <array.length ; i++) {
            array[i] =  (i *111) -array[9] - array[18] -array[27] -array[36] - array[45] - array[54] - array[63] -array[72] - array[81] - array[90] -array[99] ;
sum = sum + array[i];

        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);

    }
}

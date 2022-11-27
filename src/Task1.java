import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
       int[] array = new int[100];
        for (int i = 0; i <array.length ; i++) {
            array[i] = 0;
        }
        for (int n = 1; n <99 ; n++) {
            array[n] = 10;
        }
        System.out.println(Arrays.toString(array));
    }
}
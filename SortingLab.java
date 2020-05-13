import java.util.*;

public class SortingLab {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100) + 1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}

// the top method sorting algorithm displays an
// array of integers to 100 the bottom loops
// does the same but in reverse
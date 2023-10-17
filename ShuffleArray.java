//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        Integer[] array = new Integer[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);

        Integer[] shuffledArray = list.toArray(new Integer[n]);

        System.out.println("Shuffled array: ");
        for (int number : shuffledArray) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}


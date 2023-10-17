//Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)
import java.util.Scanner;
public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a boolean array to represent the presence of each letter (a to z)
        boolean[] alphabet = new boolean[26];
        input = input.toLowerCase();

        // Iterate through the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all letters are present (all values in the array are true)
        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}

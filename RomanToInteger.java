//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = romanMap.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }

        return result;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is " + integerEquivalent);

        scanner.close();
    }
}
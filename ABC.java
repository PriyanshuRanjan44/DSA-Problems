package Week_4;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int countA = 0, countB = 0, countC = 0;

        for (char ch : input.toCharArray()) {
            if (ch == 'a') countA++;
            else if (ch == 'b') countB++;
            else if (ch == 'c') countC++;
        }


        int maxCount = Math.max(countA, Math.max(countB, countC));

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < maxCount; i++) {
            output.append("abc");
        }

        int addedChars = output.length() - input.length();

        System.out.println("Output: " + output);

        scanner.close();
    }
}

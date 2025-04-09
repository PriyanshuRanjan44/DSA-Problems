package Week_4;

import java.util.Scanner;

public class CompleteAbcPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        String output = transformToFullAbc(input);
        System.out.println("Output: " + output);
        int AddedChar = output.length()-input.length();
        System.out.println("Characters Added: "+ AddedChar);
    }

    public static String transformToFullAbc(String input) {
        int count = 0;
        int i = 0;

        while (i < input.length()) {
            char ch = input.charAt(i);
            if (i + 1 < input.length()) {
                String pair = input.substring(i, i + 2);
                if (pair.equals("ab") || pair.equals("bc") || pair.equals("ac")) {
                    count++;
                    i += 2;
                    continue;
                }
            }

            if (ch == 'a' || ch == 'b' || ch == 'c') {
                count++;
            }

            i++;
        }

        if (count == 0) return "";

        StringBuilder output = new StringBuilder();
        for (int j = 0; j < count; j++) {
            output.append("abc");
        }

        return output.toString();
    }
    
}

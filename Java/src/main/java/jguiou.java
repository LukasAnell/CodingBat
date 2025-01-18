import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class jguiou {
    public String manualConcatenation(String input1, int input2) {
        return input1 + input2;
    }

    public int squareThenTriple(int input) {
        return (input * input) * 3;
    }

    public String parseOneWord(String input) {
        return input.substring(0, input.indexOf(" "));
    }

    public int firstIndexOfEither(String base, String query1, String query2) {
        return Math.min(base.indexOf(query1), base.indexOf(query2));
    }

    public String firstHalfOfString(String input) {
        return input.substring(0, input.length() / 2);
    }

    public String secondHalfOfString(String input) {
        return input.substring(input.length() / 2);
    }

    public int truncateLastDigit(int input) {
        return input / 10;
    }

    public int extractLastDigit(int input) {
        return input % 10;
    }

    public int secondIndexOf(String base, String query) {
        return base.indexOf(query, base.indexOf(query) + 1);
    }

    public int customIndexOf(String base, String query) {
        for (int i = 0; i < base.length() - query.length() + 1; i++) {
            if (base.startsWith(query, i)) {
                return i;
            }
        }
        return -1;
    }

    public int countInstances(String base, String query) {
        int count = 0;
        while (base.contains(query)) {
            base = base.replaceFirst(query, "");
            count++;
        }
        return count;
    }

    public String concatenateNums(int x, int y) {
        String out = "";
        for (int i = x; i <= y; i++) {
            out += i;
        }
        return out;
    }

    public String stringReversal(String input) {
        return (new StringBuilder(input)).reverse().toString();
    }

    public int multiplyDigits(int input) {
        String inputString = String.valueOf(input);
        int out = 1;
        for (int i = 0; i < inputString.length(); i++) {
            out *= Integer.parseInt(inputString.substring(i, i + 1));
        }
        return out;
    }

    public int extractDigit(int base, int reverseIndex) {
        int temp = base;
        String newBase = "" + base;
        if (reverseIndex - 1 >= newBase.length()) {
            return -1;
        }
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        while (temp > 0) {
            intArray.add(temp % 10);
            temp /= 10;
        }
        return intArray.get(reverseIndex - 1);
    }

    public String alphabetize(String word) {
        Random random = new Random();
        boolean decision = random.nextBoolean();
        if (decision) { // one solution (built-in sorting)
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            return new String(wordArray);
        } else { // other solution (manual sorting)
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < word.length() - 1; i++) {
                    String currentChar = word.substring(i, i + 1);
                    String nextChar = word.substring(i + 1, i + 2);
                    if (currentChar.compareTo(nextChar) > 0) {
                        sorted = false;
                        word = word.substring(0, i) + nextChar + currentChar + word.substring(i + 2);
                    }
                }
            }
            return word;
        }
    }
}

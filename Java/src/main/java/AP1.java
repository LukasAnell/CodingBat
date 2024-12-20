import java.util.ArrayList;
import java.util.List;

public class AP1 {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == 100 && scores[i - 1] == 100) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 2; i < scores.length; i++) {
            if (scores[i] - scores[i - 2] <= 2) {
                return true;
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int firstScore = average(scores, 0, scores.length / 2);
        int secondScore = average(scores, scores.length / 2, scores.length);
        return Math.max(firstScore, secondScore);
    }

    private int average(int[] scores, int start, int end) {
        int total = 0;
        for (int i = start; i < end; i++) {
            total += scores[i];
        }
        return total / (end - start);
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] out = new String[n];
        System.arraycopy(words, 0, out, 0, n);
        return out;
    }

    public List<String> wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }
        }
        return result;
    }

    public boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public boolean dividesSelf(int n) {
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
                if (index == count) {
                    break;
                }
            }
        }
        return result;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int num : nums) {
            if ((num >= 0 && num <= 10) || (num >= 90 && num <= 100)) {
                result[index++] = num;
                if (index == count) {
                    break;
                }
            }
        }
        return result;
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) {
                score += 0;
            } else if (answers[i].equals(key[i])) {
                score += 4;
            } else {
                score -= 1;
            }
        }
        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                result[index++] = word;
            }
        }

        return result;
    }

    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecialScore(a) + largestSpecialScore(b);
    }

    private int largestSpecialScore(int[] scores) {
        int max = 0;
        for (int score : scores) {
            if (score % 10 == 0 && score > max) {
                max = score;
            }
        }
        return max;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i + 1] - heights[i]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            int change = heights[i + 1] - heights[i];
            if (change > 0) {
                sum += 2 * change;
            } else {
                sum += Math.abs(change);
            }
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int bigSteps = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i + 1] - heights[i]) >= 5) {
                bigSteps++;
            }
        }
        return bigSteps;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameCompare = aName.compareTo(bName);
        if (nameCompare != 0) {
            return nameCompare < 0 ? -1 : 1;
        } else {
            return Integer.compare(aId, bId);
        }
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int i = 0, j = 0, k = 0;
        while (k < n) {
            if (a[i].compareTo(b[j]) < 0) {
                if (k == 0 || !a[i].equals(result[k - 1])) {
                    result[k++] = a[i];
                }
                i++;
            } else if (a[i].compareTo(b[j]) > 0) {
                if (k == 0 || !b[j].equals(result[k - 1])) {
                    result[k++] = b[j];
                }
                j++;
            } else {
                if (k == 0 || !a[i].equals(result[k - 1])) {
                    result[k++] = a[i];
                }
                i++;
                j++;
            }
        }
        return result;
    }

    public int commonTwo(String[] a, String[] b) {
        int i = 0, j = 0, count = 0;
        while (i < a.length && j < b.length) {
            if (a[i].equals(b[j])) {
                count++;
                String common = a[i];
                while (i < a.length && a[i].equals(common)) i++;
                while (j < b.length && b[j].equals(common)) j++;
            } else if (a[i].compareTo(b[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map2 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> out = new HashMap<>();
        for (String string : strings) {
            if (!out.containsKey(string)) {
                out.put(string, 0);
            }
        }
        return out;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> out = new HashMap<>();
        for (String string : strings) {
            if (!out.containsKey(string)) {
                out.put(string, string.length());
            }
        }
        return out;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> out = new HashMap<>();
        for (String string : strings) {
            out.put(string.substring(0, 1), string.substring(string.length() - 1));
        }
        return out;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> out = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!out.containsKey(strings[i])) {
                int count = 0;
                for (int j = i; j < strings.length; j++) {
                    if (strings[i].equals(strings[j])) {
                        count++;
                    }
                }
                out.put(strings[i], count);
            }
        }
        return out;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> out = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = strings[i].substring(0, 1);
            if (!out.containsKey(firstChar)) {
                String concatString = "";
                for (int j = i; j < strings.length; j++) {
                    if (firstChar.equals(strings[j].substring(0, 1))) {
                        concatString += strings[j];
                    }
                }
                out.put(firstChar, concatString);
            }
        }
        return out;
    }

    public String wordAppend(String[] strings) {
        String out = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.compute(s, (k, count) -> count + 1);
            }
            if (map.get(s) != 1 && map.get(s) % 2 == 0) {
                out += s;
            }
        }
        return out;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> out = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!out.containsKey(strings[i])) {
                int count = 1;
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[i].equals(strings[j])) {
                        count++;
                    }
                }
                if (count >= 2) {
                    out.put(strings[i], true);
                } else {
                    out.put(strings[i], false);
                }
            }
        }
        return out;
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = strings[i].substring(0, 1);
            if (map.containsKey(firstChar)) {
                int swapIndex = map.get(firstChar);
                String temp = strings[swapIndex];
                strings[swapIndex] = strings[i];
                strings[i] = temp;
                map.remove(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }
        return strings;
    }

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> swapped = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = strings[i].substring(0, 1);
            if (map.containsKey(firstChar) && !swapped.contains(firstChar)) {
                int swapIndex = map.get(firstChar);
                String temp = strings[swapIndex];
                strings[swapIndex] = strings[i];
                strings[i] = temp;
                swapped.add(firstChar);
            } else if (!map.containsKey(firstChar)) {
                map.put(firstChar, i);
            }
        }
        return strings;
    }
}

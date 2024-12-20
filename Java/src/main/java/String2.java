public class String2 {
    public String doubleChar(String str) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            out += str.charAt(i) + str.substring(i, i + 1);
        }
        return out;
    }

    public int countHi(String str) {
        return str.length() - str.replace("hi", " ").length();
    }

    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) {
                cat++;
            }
            if (str.startsWith("dog", i)) {
                dog++;
            }
        }
        return cat == dog;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();
        }
        return a.endsWith(b);
    }

    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")) {
            return true;
        }
        for (int i = 1; i < str.length() - 2; i++) {
            if (str.charAt(i - 1) != '.' && str.startsWith("xyz", i))
                return true;
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        boolean balance = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'y') {
                balance = true;
            }
            if (str.charAt(i) == 'x' && !balance) {
                return false;
            }
        }
        return true;
    }

    public String mixString(String a, String b) {
        int min = Math.min(a.length(), b.length());
        String out = "";
        for (int i = 0; i <= min - 1; i++) {
            out += a.charAt(i) + b.substring(i, i + 1);
        }
        return out += b.substring(min) + a.substring(min);
    }

    public String repeatEnd(String str, int n) {
        String newStr = str.substring(str.length() - n);
        String out = "";
        for (int i = 0; i < n; i++) {
            out += newStr;
        }
        return out;
    }

    public String repeatFront(String str, int n) {
        int len = str.length();
        String newWord = "";

        for (int i = n; n > 0; n--) {
            newWord += str.substring(0, n);
        }
        return newWord;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String result = word;
        if (count == 0) return "";
        for (int i = 1; i < count; i++) {
            result = result + sep + word;
        }
        return result;
    }

    public boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0, n));
    }

    public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        int start1 = str.length() / 2 - 2;
        int start2 = str.length() / 2 - 1;
        if (str.length() % 2 == 0) {
            return str.startsWith("xyz", start1) ||
                    str.startsWith("xyz", start2);

        }
        return str.startsWith("xyz", start2);
    }

    public String getSandwich(String str) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < str.length() - 5; i++) {
            if (str.startsWith("bread", i)) {
                first = i;
                break;
            }
        }
        for (int i = str.length() - 5; i >= 0; i--) {
            if (str.startsWith("bread", i)) {
                last = i;
                break;
            }
        }
        if (first != -1 && last != -1 && first != last)
            return str.substring(first + 5, last);
        return "";
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }
        return true;
    }

    public String oneTwo(String str) {
        String out = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            out += str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return out;
    }

    public String zipZap(String str) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            out += str.substring(i, i + 1);
            if (i > 0 && i < str.length() - 1) {
                if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
                    out = out.substring(0, out.length() - 1);
                }
            }
        }
        return out;
    }

    public String starOut(String str) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != '*')
                out += str.charAt(i);

            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*')
                out += str.charAt(i);

            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
                out = out.substring(0, out.length() - 1);
        }
        return out;
    }

    public String plusOut(String str, String word) {
        int slen = str.length();
        int wlen = word.length();
        String fin = "";
        for (int i = 0; i < slen; i++) {
            if (i <= slen - wlen) {
                String tmp = str.substring(i, i + wlen);
                if (tmp.equals(word)) {
                    fin += word;
                    i += wlen - 1;
                } else
                    fin += "+";
            } else
                fin += "+";
        }
        return fin;
    }

    public String wordEnds(String str, String word) {
        String out = "";
        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            if (i > 0 && str.startsWith(word, i)) {
                out += str.substring(i - 1, i);
            }
            if (i < str.length() - word.length() && str.startsWith(word, i)) {
                out += str.substring(i + word.length(), i + word.length() + 1);
            }
        }
        return out;
    }
}

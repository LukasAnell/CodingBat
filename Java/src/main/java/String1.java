public class String1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        String out = "";
        if (front) {
            return str.charAt(0) + out;
        } else {
            return str.charAt(str.length() - 1) + out;
        }
    }

    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index + 2 > str.length() || index < 0) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    public String middleThree(String str) {
        return str.substring((str.length() / 2) - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        return str.startsWith("bad") || str.startsWith("bad", 1);
    }

    public String atFirst(String str) {
        if (str.length() < 2) {
            if (str.isEmpty()) {
                return "@@";
            } else {
                return str + "@";
            }
        } else {
            return str.substring(0, 2);
        }
    }

    public String lastChars(String a, String b) {
        String first = "@";
        String last = "@";
        if (!a.isEmpty()) {
            first = a.substring(0, 1);
        }
        if (!b.isEmpty()) {
            last = b.substring(b.length() - 1);
        }
        return first + last;
    }

    public String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a + b;
        }
        if (a.substring((a.length() - 1)).equals(b.substring(0, 1))) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.charAt(str.length() - 2);
        }
    }

    public String seeColor(String str) {
        if (str.equals("red")) {
            return "red";
        }
        if (str.length() < 4) {
            return "";
        }
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    public String minCat(String a, String b) {
        int min = Math.min(a.length(), b.length());
        return a.substring(a.length() - min) + b.substring(b.length() - min);
    }

    public String extraFront(String str) {
        String out = "";
        if (str.length() < 2) {
            for (int i = 0; i < 3; i++) {
                out += str;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                out += str.charAt(0) + str.substring(1, 2);
            }
        }
        return out;
    }

    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        } else {
            return str;
        }
    }

    public String deFront(String str) {
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str;
        }
        if (str.charAt(0) == 'a') {
            return str.charAt(0) + str.substring(2);
        }
        if (str.charAt(1) == 'b') {
            return str.charAt(1) + str.substring(2);
        } else {
            return str.substring(2);
        }
    }

    public String startWord(String str, String word) {
        if (word.length() > str.length()) {
            return "";
        }
        if (word.equals(str.substring(0, word.length()))) {
            return str.substring(0, word.length());
        }
        if (word.substring(1).equals(str.substring(1, word.length()))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }

    public String withoutX(String str) {
        if (str.length() < 2) {
            return "";
        }
        if (str.endsWith("x") && str.charAt(0) == 'x') {
            return str.substring(1, str.length() - 1);
        }
        if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        }
        if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else {
            return str;
        }
    }

    public String withoutX2(String str) {
        if (str.length() < 2) {
            return "";
        }
        if (str.startsWith("xx")) {
            return str.substring(2);
        }
        if (str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        }
        if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else {
            return str;
        }
    }
}

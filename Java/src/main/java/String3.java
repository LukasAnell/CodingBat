public class String3 {
    public int countYZ(String str) {
        str = str.toLowerCase() + " ";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (!Character.isLetter(str.charAt(i + 1))) {
                if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                    count++;
                }
            }
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        remove = "(?i)" + remove.toLowerCase();
        return base.replaceAll(remove, "");
    }

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        if (str.length() < 2) {
            return true;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("is", i)) {
                countIs++;
            }
            if (str.startsWith("not", i)) {
                countNot++;
            }
        }
        if (str.endsWith("is")) {
            countIs++;
        }
        return countIs == countNot;
    }

    public boolean gHappy(String str) {
        String newStr = " " + str + " ";
        for (int i = 1; i < newStr.length() - 1; i++) {
            if (newStr.charAt(i) == 'g') {
                if (newStr.charAt(i - 1) != 'g' && newStr.charAt(i + 1) != 'g') {
                    return false;
                }
            }
        }
        return true;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int current = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    current++;
                } else {
                    break;
                }
                if (current == 3) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return sum;
    }

    public String sameEnds(String string) {
        int len = string.length();
        String result = "";
        for (int i = 0; i < len / 2; i++) {
            String prefix = string.substring(0, i + 1);
            String suffix = string.substring(len - i - 1);
            if (prefix.equals(suffix)) {
                result = prefix;
            }
        }
        return result;
    }

    public String mirrorEnds(String string) {
        int len = string.length();
        String result = "";
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == string.charAt(len - i - 1)) {
                result += string.charAt(i);
            } else {
                break;
            }
        }
        return result;
    }

    public int maxBlock(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int current = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    current++;
                } else {
                    break;
                }
            }
            max = Math.max(max, current);
        }
        return max;
    }

    public int sumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String currentNum = "";
            for (int j = i; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j))) {
                    currentNum += str.substring(j, j + 1);
                } else {
                    i = j;
                    break;
                }
            }

            if (!currentNum.isEmpty()) {
                sum += Integer.parseInt(currentNum);
            }
        }

        if (!str.isEmpty() && Character.isDigit(str.charAt(str.length() - 1)) && Character.isDigit(str.charAt(str.length() - 2))) {
            sum -= Integer.parseInt(str.substring(str.length() - 1));
        }


        return sum;
    }

    public String notReplace(String str) {
        String out = "";
        String newStr = " " + str + " ";
        for (int i = 1; i < newStr.length() - 1; i++) {
            if (newStr.startsWith("is", i)) {
                char leftChar = newStr.charAt(i - 1);
                char rightChar = newStr.charAt(i + 2);
                if (!Character.isLetter(leftChar) && !Character.isLetter(rightChar)) {
                    out += "is not";
                    i += 1;
                } else {
                    out += newStr.substring(i, i + 1);
                }
            } else {
                out += newStr.substring(i, i + 1);
            }
        }
        return out;
    }
}

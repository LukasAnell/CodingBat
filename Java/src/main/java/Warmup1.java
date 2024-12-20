public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }

    public int diff21(int n) {
        if (n > 21) {
            return Math.abs(n - 21) * 2;
        } else {
            return 21 - n;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10) {
            return true;
        } else {
            return a + b == 10;
        }
    }

    public boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        }
    }

    public String front3(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        }
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }

    public String backAround(String str) {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        if (str.length() <= 1) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public boolean in1020(int a, int b) {
        return (a <= 20 && a >= 10) || (b <= 20 && b >= 10);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public boolean loneTeen(int a, int b) {
        return (a <= 19 && a >= 13) ^ (b <= 19 && b >= 13);
    }

    public String delDel(String str) {
        if (str.length() >= 4 && str.startsWith("del", 1)) {
            return str.replace("del", "");
        } else {
            return str;
        }
    }

    public boolean mixStart(String str) {
        return str.length() >= 3 && str.startsWith("ix", 1);
    }

    public String startOz(String str) {
        String result = "";
        if (!str.isEmpty() && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int close10(int a, int b) {
        int diffA = Math.abs(10 - a);
        int diffB = Math.abs(10 - b);
        if (diffA < diffB) {
            return a;
        } else if (diffB < diffA) {
            return b;
        } else {
            return 0;
        }
    }

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;
        } else {
            return (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        }
    }

    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) {
            return a;
        }
        if (b >= 10 && b <= 20) {
            return b;
        }
        return 0;
    }

    public boolean stringE(String str) {
        int eCount = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'e') {
                eCount++;
            }
        }
        return eCount <= 3 && eCount >= 1;
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        }
    }

    public String everyNth(String str, int n) {
        String out = "";
        for (int i = 0; i <= str.length() - 1; i += n) {
            out += str.charAt(i);
        }
        return out;
    }
}

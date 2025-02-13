public class Recursion1 {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return n;
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies != 0) {
            if (bunnies % 2 == 0) {
                return 3 + bunnyEars2(bunnies - 1);
            } else {
                return 2 + bunnyEars2(bunnies - 1);
            }
        }
        return 0;
    }

    public int triangle(int rows) {
        if (rows != 0) {
            return triangle(rows - 1) + rows;
        }
        return 0;
    }

    public int sumDigits(int n) {
        if (n != 0) {
            return sumDigits(n / 10) + n % 10;
        }
        return 0;
    }

    public int count7(int n) {
        if (n != 0) {
            if (n % 10 == 7) {
                return 1 + count7(n / 10);
            }
            return count7(n / 10);
        }
        return 0;
    }

    public int count8(int n) {
        if (n != 0) {
            if (n % 10 == 8) {
                if ((n / 10) % 10 == 8) {
                    return 2 + count8(n / 10);
                }
                return 1 + count8(n / 10);
            }
            return count8(n / 10);
        }
        return 0;
    }

    public int powerN(int base, int n) {
        if (n != 0) {
            return powerN(base, n - 1) * base;
        }
        return 1;
    }

    public int countX(String str) {
        if (!str.isEmpty()) {
            if (str.charAt(0) == 'x') {
                return countX(str.substring(1)) + 1;
            }
            return countX(str.substring(1));
        }
        return 0;
    }

    public int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    public String changeXY(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char firstChar = str.charAt(0);
        if (firstChar == 'x') {
            firstChar = 'y';
        }
        return firstChar + changeXY(str.substring(1));
    }

    public String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.startsWith("pi")) {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }

    public String noX(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char firstChar = str.charAt(0);
        if (firstChar == 'x') {
            return noX(str.substring(1));
        }
        return firstChar + noX(str.substring(1));
    }

    public boolean array6(int[] nums, int index) {
        if (nums.length - 1 < index) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
        if (nums.length - 1 < index) {
            return 0;
        }
        if (nums[index] == 11) {
            return array11(nums, index + 1) + 1;
        }
        return array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index) {
        if (nums.length - 2 < index) {
            return false;
        }
        return nums[index + 1] == 10 * nums[index] || array220(nums, index + 1);
    }

    public String allStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }

    public String endX(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char firstChar = str.charAt(0);
        if (firstChar == 'x') {
            return endX(str.substring(1)) + firstChar;
        }
        return firstChar + endX(str.substring(1));
    }

    public int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        }
        return countPairs(str.substring(1));
    }

    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.startsWith("abc") || str.startsWith("aba")) {
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }

    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("11")) {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }

    public String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }

    public int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        if (str.length() > 2 && str.charAt(0) == 'x' && str.startsWith("hi", 1)) {
            return countHi2(str.substring(3));
        }
        return countHi2(str.substring(1));
    }

    public String parenBit(String str) {
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }
        if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        }
        return str;
    }

    public boolean nestParen(String str) {
        if (str.isEmpty()) {
            return true;
        }
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

    public boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        }
        if (str.length() < sub.length()) {
            return false;
        }
        if (str.startsWith(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        }
        return strCopies(str.substring(1), sub, n);
    }

    public int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }
        return strDist(str.substring(0, str.length() - 1), sub);
    }
}

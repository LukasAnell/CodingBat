public class Warmup2 {
    public String stringTimes(String str, int n) {
        String out = "";
        for (int i = 1; i <= n; i++) {
            out += str;
        }
        return out;
    }

    public String frontTimes(String str, int n) {
        String out = "";
        if (str.length() < 3) {
            for (int i = 1; i <= n; i++) {
                out += str;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                out += str.substring(0, 3);
            }
        }
        return out;
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("xx", i)) {
                count++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        if (i + 1 >= str.length()) return false;
        return str.charAt(i + 1) == 'x';
    }

    public String stringBits(String str) {
        String out = "";
        for (int i = 0; i <= str.length() - 1; i += 2) {
            out += str.charAt(i);
        }
        return out;
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String end = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) {
            end = 4;
        }
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int out = 0;
        for (int i = 0; i <= (Math.min(a.length(), b.length())) - 2; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                out++;
            }
        }
        return out;
    }

    public String stringX(String str) {
        String out = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.charAt(i) == 'x')) {
                out += str.charAt(i);
            }
        }
        return out;
    }

    public String altPairs(String str) {
        String out = "";
        for (int i = 0; i <= str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            out += str.substring(i, end);
        }
        return out;
    }

    public String stringYak(String str) {
        str = str.replace("yak", "");
        return str;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        boolean out = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                out = false;
                break;
            }
        }
        return out;
    }

    public boolean has271(int[] nums) {
        boolean out = false;
        for (int i = 0; i < nums.length - 2; i++) {
            int value = nums[i];
            if (nums[i + 1] == value + 5 && Math.abs(nums[i + 2] - (value - 1)) <= 2) {
                out = true;
                break;
            }
        }
        return out;
    }
}

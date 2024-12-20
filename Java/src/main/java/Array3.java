public class Array3 {
    public int maxSpan(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    max = Math.max(max, j - i + 1);
                    break;
                }
            }
        }
        return max;
    }

    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        int temp = nums[i + 1];
                        nums[i + 1] = 4;
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length && nums[j] != 5) {
            j++;
        }
        while (i < nums.length) {
            if (nums[i] == 4) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;

                while ((j < nums.length && nums[j] != 5) || j == i + 1)
                    j++;
            }
            i++;
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int num : nums) {
            leftSum += num;
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;
        while (i < outer.length && j < inner.length) {
            if (outer[i] == inner[j]) {
                j++;
            }
            i++;
        }
        return j == inner.length;
    }

    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[(i + 1) * n - j - 1] = j + 1;
            }
        }
        return result;
    }

    public int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }
        return result;
    }

    public int maxMirror(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int length = 0;
                int x = i;
                int y = j;
                while (x < nums.length && y >= 0 && nums[x] == nums[y]) {
                    length++;
                    x++;
                    y--;
                }
                max = Math.max(max, length);
            }
        }
        return max;
    }

    public int countClumps(int[] nums) {
        int clumps = 0;
        boolean inClump = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    clumps++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }
        return clumps;
    }
}

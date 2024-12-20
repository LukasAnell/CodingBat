public class Array2 {
    public int countEvens(int[] nums) {
        int numEvens = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                numEvens++;
            }
        }
        return numEvens;
    }

    public int bigDiff(int[] nums) {
        int largestVal = nums[0];
        int smallestVal = nums[0];
        for (int num : nums) {
            largestVal = Math.max(largestVal, num);
            smallestVal = Math.min(smallestVal, num);
        }
        return largestVal - smallestVal;
    }

    public int centeredAverage(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int min = nums[0];
        boolean maxSeen = false;
        boolean minSeen = false;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;
        }
        return (sum - min - max) / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                nums[i] = 0;
                if (i != nums.length - 1) {
                    nums[i + 1] = 0;
                }
            }
            sum += nums[i];
        }
        return sum;
    }

    public int sum67(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        boolean booleanSix = false;
        for (int num : nums) {
            if (num == 6) {
                booleanSix = true;
            }
            if (!booleanSix) {
                sum += num;
            }
            if (booleanSix && num == 7) {
                booleanSix = false;
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += 2;
            }
        }
        return sum == 8;
    }

    public boolean more14(int[] nums) {
        int numOnes = 0;
        int numFours = 0;
        for (int num : nums) {
            if (num == 1) {
                numOnes++;
            }
            if (num == 4) {
                numFours++;
            }
        }
        return numOnes > numFours;
    }

    public int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = "" + i;
        }
        return array;
    }

    public boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;
        for (int num : nums) {
            if (num == 1) {
                has1 = true;
            }
            if (num == 4) {
                has4 = true;
            }
        }
        return !has1 || !has4;
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val)
                return false;
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean containsTwoTwos = false;
        boolean containsTwoFours = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                containsTwoTwos = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                containsTwoFours = true;
            }
        }
        return (containsTwoTwos ^ containsTwoFours);
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int difference = Math.abs(nums1[i] - nums2[i]);
            if (difference <= 2 && difference != 0) {
                count++;
            }
        }
        return count;
    }

    public boolean has77(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[0] == 7 && nums[1] == 7) {
                return true;
            }
            if (nums[i] == 7 && nums[i + 1] == 7 || nums[i - 1] == 7 && nums[i + 1] == 7) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean hasOne = false;
        boolean hasTwo = false;
        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            }
            if (num == 2 && hasOne) {
                hasTwo = true;
            }
        }
        return hasOne && hasTwo;
    }

    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2) {
                return true;
            }
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int countThrees = 0;
        if (nums.length >= 1 && nums[0] == 3) {
            countThrees++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3) {
                countThrees++;
            }
            if (nums[i] == 3 && nums[i - 1] == 3) {
                return false;
            }
        }
        return countThrees == 3;
    }

    public boolean twoTwo(int[] nums) {
        if (nums.length == 1 && nums[0] == 2) {
            return false;
        }
        if (nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) || (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2))) {
            return false;
        }
        for (int i = 1; i <= nums.length - 2; i++) {
            if (nums[i] == 2 && nums[i - 1] != 2 && nums[i + 1] != 2) {
                return false;
            }
        }
        return true;
    }

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        if (nums.length <= 2) {
            return false;
        }
        if (nums[0] == nums[1] - 1 && nums[0] == nums[2] - 2) {
            return true;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] - 1 && nums[i] == nums[i + 2] - 2) {
                return true;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] out = new int[end - start];
        int count = 0;
        for (int i = start; i < end; i++) {
            out[count] = i;
            count++;
        }
        return out;
    }

    public int[] shiftLeft(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }

    public int[] tenRun(int[] nums) {
        boolean isTen = false;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                temp = nums[i];
                isTen = true;
            } else if (nums[i] % 10 != 0 && isTen) {
                nums[i] = temp;
            }
        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int index4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                index4 = i;
                break;
            }
        }
        int[] out = new int[index4];
        System.arraycopy(nums, 0, out, 0, index4);
        return out;
    }

    public int[] post4(int[] nums) {
        int index4 = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                index4 = i;
                break;
            }
        }
        int[] out = new int[nums.length - 1 - index4];
        for (int i = index4 + 1; i < nums.length; i++) {
            out[i - index4 - 1] = nums[i];
        }
        return out;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                nums[i] = Math.max(Math.max(nums[i], nums[i - 1]), nums[i + 1]);
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }

    public int[] withoutTen(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                nums[i] = 0;
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0 && nums[i - 1] == 0) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public int[] zeroMax(int[] nums) {
        int max = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0)
                max = Math.max(max, nums[i]);
            if (nums[i] == 0) {
                nums[i] = max;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] out = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                out[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                out[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                out[i - start] = "Buzz";
            } else {
                out[i - start] = String.valueOf(i);
            }
        }
        return out;
    }
}

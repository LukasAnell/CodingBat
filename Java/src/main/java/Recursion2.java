public class Recursion2 {
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum(start + 1, nums, target);
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }
        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum6(start + 1, nums, target);
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }
        return groupNoAdj(start + 1, nums, target);
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] % 5 == 0) {
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            }
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum5(start + 1, nums, target);
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        int sum = nums[start];
        int count = 1;
        while (start + count < nums.length && nums[start + count] == nums[start]) {
            sum += nums[start + count];
            count++;
        }
        if (groupSumClump(start + count, nums, target - sum)) {
            return true;
        }
        return groupSumClump(start + count, nums, target);
    }

    public boolean splitArray(int[] nums) {
        return splitArray(nums, 0, 0, 0);
    }

    private boolean splitArray(int[] nums, int index, int sum1, int sum2) {
        if (index >= nums.length) {
            return sum1 == sum2;
        }
        return splitArray(nums, index + 1, sum1 + nums[index], sum2) ||
                splitArray(nums, index + 1, sum1, sum2 + nums[index]);
    }

    public boolean splitOdd10(int[] nums) {
        return splitOdd10(nums, 0, 0, 0);
    }

    private boolean splitOdd10(int[] nums, int index, int sum1, int sum2) {
        if (index >= nums.length) {
            return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum2 % 10 == 0 && sum1 % 2 == 1);
        }
        return splitOdd10(nums, index + 1, sum1 + nums[index], sum2) ||
                splitOdd10(nums, index + 1, sum1, sum2 + nums[index]);
    }

    public boolean split53(int[] nums) {
        return split53(nums, 0, 0, 0);
    }

    private boolean split53(int[] nums, int index, int sum1, int sum2) {
        if (index >= nums.length) {
            return sum1 == sum2;
        }
        if (nums[index] % 5 == 0) {
            return split53(nums, index + 1, sum1 + nums[index], sum2);
        }
        if (nums[index] % 3 == 0) {
            return split53(nums, index + 1, sum1, sum2 + nums[index]);
        }
        return split53(nums, index + 1, sum1 + nums[index], sum2) ||
                split53(nums, index + 1, sum1, sum2 + nums[index]);
    }
}

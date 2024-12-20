import java.util.Arrays;

public class Array1 {
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        int out = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            out += nums[i];
        }
        return out;
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {
        int[] out = new int[3];
        Arrays.fill(out, Math.max(nums[0], nums[2]));
        return out;
    }

    public int sum2(int[] nums) {
        if (nums.length < 1) {
            return 0;
        } else if (nums.length < 2) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3) {
            return true;
        } else {
            return nums[1] == 2 || nums[1] == 3;
        }
    }

    public boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3)
                return false;
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int[] out = new int[nums.length * 2];
        out[out.length - 1] = nums[nums.length - 1];
        return out;
    }

    public boolean double23(int[] nums) {
        if (nums.length < 2)
            return false;
        return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA > sumB) {
            return a;
        }
        if (sumB > sumA) {
            return b;
        } else {
            return a;
        }
    }

    public int[] makeMiddle(int[] nums) {
        int[] out = new int[2];
        out[0] = nums[nums.length / 2 - 1];
        out[1] = nums[(nums.length / 2)];
        return out;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] out = new int[4];
        out[0] = a[0];
        out[1] = a[1];
        out[2] = b[0];
        out[3] = b[1];
        return out;
    }

    public int[] swapEnds(int[] nums) {
        int[] out = new int[nums.length];
        out[0] = nums[nums.length - 1];
        out[out.length - 1] = nums[0];
        if (nums.length - 2 >= 0) {
            System.arraycopy(nums, 1, out, 1, nums.length - 2);
        }
        return out;
    }

    public int[] midThree(int[] nums) {
        int[] myArray = new int[3];
        int middle = nums.length / 2;
        myArray[0] = nums[middle - 1];
        myArray[1] = nums[middle];
        myArray[2] = nums[middle + 1];
        return myArray;
    }

    public int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        return Math.max(first, Math.max(middle, last));
    }

    public int[] frontPiece(int[] nums) {
        int[] out;
        if (nums.length < 2) {
            out = new int[nums.length];
        } else {
            out = new int[2];
        }
        if (nums.length > 0) {
            out[0] = nums[0];
        }
        if (nums.length > 1) {
            out[1] = nums[1];
        }
        return out;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        if (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3) {
            return true;
        }
        return nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;
    }

    public int[] make2(int[] a, int[] b) {
        int[] array = new int[2];
        int aLength = a.length;
        int bLength = b.length;

        if (aLength == 0) {
            array[0] = b[0];
            array[1] = b[1];
            return array;
        } else if (aLength == 1 && bLength == 1) {
            array[0] = a[0];
            array[1] = b[0];
            return array;
        } else if (aLength == 1) {
            array[0] = a[0];
            array[1] = b[0];
            return array;
        } else {
            array[0] = a[0];
            array[1] = a[1];
            return array;
        }
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return new int[0];
        } else if (a.length == 0) {
            int[] array = new int[1];
            array[0] = b[0];
            return array;
        } else if (b.length == 0) {
            int[] array = new int[1];
            array[0] = a[0];
            return array;
        } else {
            int[] array = new int[2];
            array[0] = a[0];
            array[1] = b[0];
            return array;
        }
    }
}

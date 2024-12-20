public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {
        return big * 5 + small >= goal && goal % 5 <= small;
    }

    public int loneSum(int a, int b, int c) {
        if (b == c && a == b) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        } else {
            return a + b + c;
        }
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (n == 15 || n == 16) {
            return n;
        } else if (n >= 13 && n <= 19) {
            return 0;
        } else {
            return n;
        }
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int rd = num % 10;
        if (rd >= 5) {
            return num + 10 - rd;
        }
        return num - rd;
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else {
            return Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
        }
    }

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        }
        int sumA = 21 - a;
        int sumB = 21 - b;
        if (sumA > sumB) {
            return b;
        } else {
            return a;
        }
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int smallest = Math.min(Math.min(a, b), c);
        int largest = Math.max(Math.max(a, b), c);
        int medium = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
        return medium - smallest == largest - medium;
    }

    public int makeChocolate(int small, int big, int goal) {
        if (goal >= 5) {
            if (goal / 5 >= big) {
                goal -= big * 5;
            } else {
                goal = goal % 5;
            }
        }
        if (goal <= small) {
            return goal;
        }
        return -1;
    }
}

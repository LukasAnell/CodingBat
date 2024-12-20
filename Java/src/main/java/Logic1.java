public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else {
            return cigars <= 60 && cigars >= 40;
        }
    }

    public int dateFashion(int you, int date) {
        if ((you <= 2 || date <= 2)) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer && (temp >= 60 && temp <= 100)) {
            return true;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day >= 1 && day <= 5) {
                return "10:00";
            } else if (day == 0 || day == 6) {
                return "off";
            }
        } else {
            if (day >= 1 && day <= 5) {
                return "7:00";
            } else if (day == 0 || day == 6) {
                return "10:00";
            }
        }
        return null;
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        int sum = a + b;
        int diff = Math.abs(a - b);
        return sum == 6 || diff == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    public boolean specialEleven(int n) {
        if (n % 11 == 0) {
            return true;
        } else {
            return n % 11 == 1;
        }
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        if ((n % 3 == 0) && (n % 5 != 0)) {
            return true;
        }
        return (n % 5 == 0) && (n % 3 != 0);
    }

    public boolean less20(int n) {
        return n % 20 == 19 || n % 20 == 18;
    }

    public boolean nearTen(int num) {
        if (num % 10 == 2 || num % 10 == 1 || num % 10 == 8 || num % 10 == 9) {
            return true;
        } else {
            return num % 10 == 0;
        }
    }

    public int teenSum(int a, int b) {
        if ((a <= 19 && a > 12) || (b <= 19 && b > 12)) {
            return 19;
        } else {
            return a + b;
        }
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if (isMorning && !isMom) {
            return false;
        } else if (isMorning) {
            return true;
        } else {
            return true;
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5)
            return 0;

        if (tea >= 2 * candy || candy >= 2 * tea)
            return 2;

        return 1;
    }

    public String fizzString(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) != 'b') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b' && str.charAt(0) != 'f') {
            return "Buzz";
        } else if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else {
            return str;
        }
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 != 0) {
            return "Fizz!";
        } else if (n % 5 == 0 && n % 3 != 0) {
            return "Buzz!";
        } else if (n % 5 == 0) {
            return "FizzBuzz!";
        } else {
            return n + "!";
        }
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a - b == c || b - a == c;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a <= b && b <= c;
        } else {
            return a < b && b < c;
        }
    }

    public boolean lastDigit(int a, int b, int c) {
        if (a % 10 == b % 10) {
            return true;
        } else if (b % 10 == c % 10) {
            return true;
        } else {
            return a % 10 == c % 10;
        }
    }

    public boolean lessBy10(int a, int b, int c) {
        if (Math.abs(a - c) >= 10) {
            return true;
        } else if (Math.abs(a - b) >= 10) {
            return true;
        } else {
            return Math.abs(b - c) >= 10;
        }
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1++;
            if (die1 == 7)
                die1 = 1;
        }

        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Math.min(a, b);
        } else {
            return Math.max(a, b);
        }
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    public int greenTicket(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return 0;
        } else if (a == b && b == c) {
            return 20;
        } else {
            return 10;
        }
    }

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10) {
            return 10;
        } else if (a + b == b + c + 10 || a + b == a + c + 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public boolean shareDigit(int a, int b) {
        if (a % 10 == b % 10 || a / 10 == b / 10) {
            return true;
        } else {
            return a / 10 == b % 10 || a % 10 == b / 10;
        }
    }

    public int sumLimit(int a, int b) {
        String strA = String.valueOf(a);
        String strBoth = String.valueOf(a + b);
        if (strA.length() == strBoth.length()) {
            return a + b;
        } else {
            return a;
        }
    }
}

def round_sum(a, b, c):
    return round10(a) + round10(b) + round10(c)


def round10(num):
    return int(round(num, -1))

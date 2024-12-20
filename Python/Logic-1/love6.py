def love6(a, b):
    if a is 6 or b is 6:
        return True
    elif a + b == 6:
        return True
    elif a - b == 6 or b - a == 6:
        return True
    else:
        return False
